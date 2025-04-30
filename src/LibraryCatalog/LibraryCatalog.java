package LibraryCatalog;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class LibraryCatalog {
    private Map<String, Book> books;

    public LibraryCatalog() {
        this.books = new HashMap<>();
    }

    public void addBook(Book book) {
        if (!books.containsKey(book.getBookID())) {
            books.put(book.getBookID(), book);
            System.out.println("Book added to the library.");
        } else {
            System.out.println("Error: A Book with this ID already exists.");
        }
    }

    public void viewBook(String bookID) {
        if (books.containsKey(bookID)) {
            books.get(bookID).displayBookDetails();
        } else {
            System.out.println("Error: The Book with this ID was not found.");
        }
    }

    public void checkAvailability(String bookID) {
        if (books.containsKey(bookID)) {
            Book book = books.get(bookID);
            System.out.println("The book is " + (book.isAvailable() ? "available." : "not available."));
        } else {
            System.out.println("Error: The Book with this ID was not found.");
        }
    }

    public void toggleAvailability(String bookID) {
        if (books.containsKey(bookID)) {
            Book book = books.get(bookID);
            book.toggleAvailability();
            System.out.println("Thr availability has been updated.");
        } else {
            System.out.println("Error: The Book with this ID was not found.");
        }
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The book list is empty.");
        } else {
            for (Book book : books.values()) {
                book.displayBookDetails();
                System.out.println("\n");
            }
        }
    }

    public boolean isValidBookID(String bookID) {
        // Book ID format: 3 uppercase letters followed by 4 digits (e.g., ABC1234)
        String regex = "^[a-z]{2}\\d{3}$";
        return Pattern.matches(regex, bookID);
    }
}
