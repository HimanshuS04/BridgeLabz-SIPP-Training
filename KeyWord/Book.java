public class Book {

    // Static variable shared across all books
    static String libraryName = "MyLibrary";

    // Final variable for unique identifier
    private final String isbn;

    private String title;
    private String author;

    // Constructor using 'this' to initialize variables
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Getters and setters for title and author
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Method to display book details with instanceof check
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Library Name: " + libraryName);
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("ISBN: " + this.isbn);
        } else {
            System.out.println("Object is not an instance of Book");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");

        displayLibraryName();

        book1.displayBookDetails();
        book2.displayBookDetails();

        // Demonstrating that isbn cannot be changed
        // book1.isbn = "1234567890"; // This line would cause a compilation error

        book1.setTitle("The Great Gatsby - Updated");
        book1.displayBookDetails();
    }
}
