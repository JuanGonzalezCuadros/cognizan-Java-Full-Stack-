package LibraryCatalog;

import java.util.Scanner;

public class LibraryCatalogSystem {
    static LibraryCatalog catalog = new LibraryCatalog();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the Library Catalog Management System!");
            System.out.println("What action do you want to take?");
            System.out.println("1 - Add a new book");
            System.out.println("2 - View book details");
            System.out.println("3 - Check book availability");
            System.out.println("4 - Toggle book availability");
            System.out.println("5 - List all books");
            System.out.println("6 - Exit");
            System.out.print("Choose an option: ");

            int choice = getUserInputChoice();
            switch (choice) {
                case 1:
                    addNewBook();
                    break;
                case 2:
                    viewBookDetails();
                    break;
                case 3:
                    checkBookAvailability();
                    break;
                case 4:
                    toggleBookAvailability();
                    break;
                case 5:
                    catalog.displayAllBooks();
                    break;
                case 6:
                    System.out.println("Exiting system...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static int getUserInputChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void addNewBook() {
        System.out.print("Enter book ID (Format: 2 lowercase letters followed by 3 digits): ");
        String bookID = scanner.nextLine();
        if (!catalog.isValidBookID(bookID)) {
            System.out.println("Error: the book ID is not valid.");
            return;
        }

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        System.out.print("Enter book genre: ");
        String genre = scanner.nextLine();

        Book newBook = new Book(bookID, title, author, genre);
        catalog.addBook(newBook);
    }

    private static void viewBookDetails() {
        System.out.print("Enter book ID: ");
        String bookID = scanner.nextLine();
        catalog.viewBook(bookID);
    }

    private static void checkBookAvailability() {
        System.out.print("Enter book ID: ");
        String bookID = scanner.nextLine();
        catalog.checkAvailability(bookID);
    }

    private static void toggleBookAvailability() {
        System.out.print("Enter book ID: ");
        String bookID = scanner.nextLine();
        catalog.toggleAvailability(bookID);
    }
}
