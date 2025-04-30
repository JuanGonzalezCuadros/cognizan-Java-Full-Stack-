package libraryManagement;

public class EBook extends Book{
    private String fileFormat;
    private double fileSize;

    public EBook(String title, String author, String isbn, String fileFormat, double fileSize) {
        super(title, author, isbn);
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("File Format: " + fileFormat + ", File Size: " + fileSize + "MB");
    }

    @Override
    public boolean borrowBook() {
        if (super.isAvailable()) {
            System.out.println("EBook: " + getTitle() + " has been borrowed.");
            super.setAvailability(false);
            return true;
        }
        return false;
    }
}
