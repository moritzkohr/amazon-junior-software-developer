import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LibraryMenu {
    private Library library;
    private UserInteractionLogger logger = new UserInteractionLogger();
    private LibrarySerializer serializer = new LibrarySerializer();  // Added serializer

    public LibraryMenu(Library library) {
        this.library = library;

        // Load the library data when the program starts
        List<Book> books = serializer.loadLibrary("src/resources/data/library.ser");
        if (books != null) {
            library.setBooks(books);
            System.out.println("Library loaded successfully.");
        } else {
            System.out.println("No saved library found. Loading default books.");
            library.loadBooks("src/resources/data/books.txt");
        }
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // TODO - missing code
            System.out.println("=== Main Menu ===\n\n");
            System.out.println("1. View all books");
            System.out.println("2. Sort books by title");
            System.out.println("3. Sort books by author");
            System.out.println("4. Sort books by publication year");
            System.out.println("5. Search for a book by keyword");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    library.viewAllBooks();
                    break;
                case 2:
                    SortUtil.bubbleSort(library.getBooks(), (book1, book2) -> book1.getTitle().compareTo(book2.getTitle()));
                    library.viewAllBooks();
                    break;
                case 3:
                    SortUtil.bubbleSort(library.getBooks(), (book1, book2) -> book1.getAuthor().compareTo(book2.getAuthor()));
                    library.viewAllBooks();
                    break;
                case 4:
                    SortUtil.bubbleSort(library.getBooks(), (book1, book2) -> book1.getPublicationYear() - book2.getPublicationYear());
                    library.viewAllBooks();
                    break;
                case 5:
                    System.out.print("Enter a keyword to search (title, author, or year): ");
                    scanner.nextLine();
                    String keyword = scanner.nextLine();
                    Book foundBook = library.searchBookByKeyword(keyword);
                    if (foundBook != null) {
                        System.out.println("Found: " + foundBook);
                    } else {
                        System.out.println("No matching book found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

}
