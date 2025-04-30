package libraryManagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public boolean borrowBook(Member member, Book book) {
        return member.borrowBook(book);
    }

    public void getAllBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayBookDetails();
            }
        }
    }

    public void addMember(Member member) {
        this.members.add(member);
    }

    public void getAllMembers() {
        System.out.println("Registered Members:");
        for (Member member : members) {
            member.displayMemberDetails();
        }
    }
}
