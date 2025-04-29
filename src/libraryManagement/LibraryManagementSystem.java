package libraryManagement;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Library library = new Library();

        System.out.println("Add a new book to the library:");
        newBook(library, "The Lord of the Rings", "J.R.R. Tolkien", "978-0618153970", true);
        newBook(library, "Pride and Prejudice", "Jane Austen", "978-0141439518", true);

        System.out.println("Register a new member to the library:");
        newMember(library, "Jose Alberto", 1, 0);

        //library.borrowBook(user, book);

        System.out.println("All books in the library:");
        printAllBooks(library);

        System.out.println("All registered members in the library:");
        registeredMembers(library);
    }

    public static void newBook(Library library, String title, String author, String isbn, boolean availability){
        Book book = new Book(title, author, isbn, availability);
        library.addBook(book);
    }

    public static void printAllBooks(Library library){
        for (Book book : library.getAllBooks()) {
            System.out.println(book);
        }
    }

    public static void newMember(Library library, String name, int memberId, int borrowedBooks){
        Member member = new Member(name, memberId, borrowedBooks);
        library.addMember(member);
    }

    public static void registeredMembers(Library library){
        for (Member member : library.getAllMembers()) {
            System.out.println(member);
        }
    }
}
