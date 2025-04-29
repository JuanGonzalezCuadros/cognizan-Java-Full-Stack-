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

    public List<Book> getAllBooks() {
        return new ArrayList<>(this.books); // Return a copy to prevent external modification
    }

    public void addMember(Member member) {
        this.members.add(member);
    }

    public List<Member> getAllMembers() {
        return new ArrayList<>(this.members); // Return a copy to prevent external modification
    }
}
