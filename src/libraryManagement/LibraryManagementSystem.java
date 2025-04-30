package libraryManagement;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        //Add books
        System.out.println("Add a new book to the library:");
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "978-0618153970");
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", "978-0141439518");
        EBook ebook1 = new EBook("Python for Beginners", "Alex Brown", "987654", "PDF", 5.4);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(ebook1);

        //Add members
        System.out.println("Register a new member to the library:");
        Member member1 = new Member("Jose Alberto", 1);
        PremiumMember member2 = new PremiumMember("Bob", 2);

        library.addMember(member1);
        library.addMember(member2);

        //Display books
        library.getAllBooks();

        //Member borrowing books
        System.out.println("\nMember borrowing books:");
        library.borrowBook(member1, book1);
        library.borrowBook(member2, ebook1);

        // Display updated list of available books
        library.getAllBooks();

        //Display members
        System.out.println("\n");
        library.getAllMembers();
    }
}
