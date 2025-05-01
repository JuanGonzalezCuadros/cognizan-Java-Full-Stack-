package PetAdoptionCenter;

import java.util.Scanner;
import java.util.List;

public class AdoptionApp {
    private static Scanner scanner = new Scanner(System.in);
    private static PetAdoptionCenter center = new PetAdoptionCenter();
    private static String filePath  = "AdoptionCenterData.ser";

    public static void main(String[] args) {
        //Load object file
        try {
            center.loadData(filePath);
            System.out.println("The Data has been loaded successfully.\n");
        } catch (Exception e) {
            System.out.println("No saved data found.\n");
        }

        //App Menu
        boolean running = true;
        while(running) {
            System.out.println("\nWelcome to the Pet Adoption Center Menu");
            System.out.println("1 - Add New Pet");
            System.out.println("2 - Register New Adopter");
            System.out.println("3 - View Available Pets");
            System.out.println("4 - List Available Adopters");
            System.out.println("5 - Adopt a Pet");
            System.out.println("6 - Search Pets");
            System.out.println("7 - Save and Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            //Switch with exception handling
            try{
                switch (choice){
                    case 1: addNewPet(); break;
                    case 2: registerNewAdopter(); break;
                    case 3: center.listAvailablePets(); break;
                    case 4: center.listAvailableAdopters(); break;
                    case 5: adoptPet(); break;
                    case 6: searchPets(); break;
                    case 7:
                        center.saveData(filePath);
                        System.out.println("Data Saved. Exiting program.");
                        running = false;
                        break;
                    default: System.out.println("The selection is invalid. Please try again."); break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    //Add new pet
    private static void addNewPet(){
        System.out.print("Enter Pet ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Pet Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Pet Species (Dog/Cat/Bird): ");
        String species = scanner.nextLine();
        System.out.print("Enter Pet Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Pet Breed: ");
        String breed = scanner.nextLine();

        Pet newPet = null;
        switch (species.toLowerCase()) {
            case "dog": newPet = new Dog(id, name, age, breed); break;
            case "cat": newPet = new Cat(id, name, age, breed); break;
            case "bird": newPet = new Bird(id, name, age, breed); break;
            default: System.out.println("Invalid species. Pet not added."); break;
        }

        center.addPet(newPet);
        System.out.println("The new pet has been successfully added.");
    }

    //Register new adopter
    private static void registerNewAdopter(){
        System.out.print("Enter Adopter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Adopter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Adopter Contact Info: ");
        String contact = scanner.nextLine();

        Adopter adopter = new Adopter(id, name, contact);
        center.registerAdopter(adopter);
        System.out.println("The new adopter has been successfully registered.");
    }

    //Adopt a pet
    private static void adoptPet() throws Exception{
        System.out.print("Enter ID of the Adopter: ");
        int adopterId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter ID of the Pet to adopt: ");
        int petId = Integer.parseInt(scanner.nextLine());

        center.adoptPet(adopterId, petId);
        System.out.println("The adopter " + adopterId + " adopted the Pet " + petId + " successfully.");
    }

    //Search for pets
    private static void searchPets() {
        System.out.print("Enter Species (leave blank for any): ");
        String species = scanner.nextLine();
        if (species.isBlank()) species = null;

        System.out.print("Enter Max Age (enter -1 for no age limit): ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Breed (or leave blank for any): ");
        String breed = scanner.nextLine();
        if (breed.isBlank()) breed = null;

        System.out.print("Only show available pets? (yes/no): ");
        boolean onlyAvailable = scanner.nextLine().equalsIgnoreCase("yes");

        List<Pet> results = center.searchPets(species, age, breed, onlyAvailable);
        if(results.isEmpty()){
            System.out.println("There were no pets that match the criteria");
        } else {
            System.out.println("Match founded:");
            results.forEach(System.out::println);
        }
    }
}
