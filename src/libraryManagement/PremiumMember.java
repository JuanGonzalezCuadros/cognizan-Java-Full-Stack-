package libraryManagement;

public class PremiumMember extends Member{
    private int maxBooks = 10;

    public PremiumMember(String name, int memberId) {
        super(name, memberId);
    }

    @Override
    public boolean borrowBook(Book book) {
        if (getBorrowedBooks().size() < maxBooks && book.borrowBook()) {
            getBorrowedBooks().add(book);
            return true;
        }
        System.out.println("Premium member can borrow up to " + maxBooks + " books.");
        return false;
    }
}
