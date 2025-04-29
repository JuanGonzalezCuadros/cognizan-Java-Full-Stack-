package libraryManagement;

public class EBook extends Book{
    private String fileFormat;
    private int fileSize;

    public EBook(String title, String author, String isbn, boolean availability, String fileFormat, int fileSize) {
        super(title, author, isbn, availability);
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + super.getTitle() + '\'' +
                ", author='" + super.getAuthor() + '\'' +
                ", isbn='" + super.getISBN() + '\'' +
                '}';
    }
}
