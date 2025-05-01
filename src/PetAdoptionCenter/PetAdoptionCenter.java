package PetAdoptionCenter;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetAdoptionCenter {
    private Map<Integer, Pet> pets = new HashMap<>();
    private Map<Integer, Adopter> adopters = new HashMap<>();

    public void addPet(Pet pet) {
        pets.put(pet.getPetId(), pet);
    }

    public void registerAdopter(Adopter adopter) {
        adopters.put(adopter.getAdopterId(), adopter);
    }

    public void adoptPet(int adopterId, int petId) throws Exception {
        Pet pet = pets.get(petId);
        Adopter adopter = adopters.get(adopterId);

        if(pet == null) throw new Exception("The pet was not found on the list.");
        if(adopter == null) throw new Exception("The adopter was not found on the list");
        if(pet.isAdopted()) throw new Exception("The pet has already been adopted");

        pet.adopt();
        adopter.adoptPet(pet);
    }

    public void listAvailablePets() {
        for (Pet pet : pets.values()) {
            if (!pet.isAdopted()) {
                System.out.println(pet);
            }
        }
    }

    public void listAvailableAdopters() {
        for (Adopter adopter : adopters.values()) {
            System.out.println(adopter);
            System.out.println(adopter.getAdoptedPets());
        }
    }

    public List<Pet> searchPets(String species, int maxAge, String breed, boolean onlyAvailable) {
        List<Pet> results = new ArrayList<>();

        for (Pet pet : pets.values()) {
            boolean match = (species == null || pet.getSpecies().equalsIgnoreCase(species))
                    && (breed == null || pet.getBreed().equalsIgnoreCase(breed))
                    && (maxAge == -1 || pet.getAge() <= maxAge)
                    && (!onlyAvailable || !pet.isAdopted());

            if(match) results.add(pet);
        }

        return results;
    }

    public void saveData(String filePath) throws IOException {
        try (ObjectOutputStream fileOut = new ObjectOutputStream(new FileOutputStream(filePath))) {
            fileOut.writeObject(pets);
            fileOut.writeObject(adopters);
        }
    }

    public void loadData(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream(filePath))) {
            pets = (Map<Integer, Pet>) fileIn.readObject();
            adopters = (Map<Integer, Adopter>) fileIn.readObject();
        }
    }
}
