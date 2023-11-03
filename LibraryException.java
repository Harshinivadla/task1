import java.util.ArrayList;
import java.util.Scanner;

class DuplicateBookException extends Exception {
    public DuplicateBookException(String message) {
        super(message);
    }
}

class DuplicateMagazineException extends Exception {
    public DuplicateMagazineException(String message) {
        super(message);
    }
}

class InvalidBookException extends Exception {
    public InvalidBookException(String message) {
        super(message);
    }
}

class InvalidMagazineException extends Exception {
    public InvalidMagazineException(String message) {
        super(message);
    }
}

class Item {
    private String title;

    public Item(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return "Item";
    }

    public String toString() {
        return "Title: " + title + ", Type: " + getType();
    }
}

class Book extends Item {
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return "Book";
    }

    public String toString() {
        return super.toString() + ", Author: " + author;
    }
}

class Magazine extends Item {
    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        super(title);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public String getType() {
        return "Magazine";
    }

    public String toString() {
        return super.toString() + ", Issue Number: " + issueNumber;
    }
}

class Library {
    private ArrayList<Item> collection = new ArrayList<>();

    public void addItem(Item item) throws DuplicateBookException, DuplicateMagazineException, InvalidBookException, InvalidMagazineException {
        if (item instanceof Book) {
            for (Item existingItem : collection) {
                if (existingItem instanceof Book && existingItem.getTitle().equals(item.getTitle())) {
                    throw new DuplicateBookException("Duplicate book found: " + item.getTitle());
                }
            }
            if (item.getTitle().isEmpty() || ((Book) item).getAuthor().isEmpty()) {
                throw new InvalidBookException("Invalid book: Title and Author cannot be empty.");
            }
        } else if (item instanceof Magazine) {
            for (Item existingItem : collection) {
                if (existingItem instanceof Magazine && existingItem.getTitle().equals(item.getTitle())) {
                    throw new DuplicateMagazineException("Duplicate magazine found: " + item.getTitle());
                }
            }
            if (item.getTitle().isEmpty() || ((Magazine) item).getIssueNumber() <= 0) {
                throw new InvalidMagazineException("Invalid magazine: Title cannot be empty, and Issue Number must be positive.");
            }
        }
        collection.add(item);
    }

    public void removeItem(Item item) {
        collection.remove(item);
    }

    public void displayCollection() {
        System.out.println("Library Collection:");
        for (Item item : collection) {
            System.out.println(item);
        }
    }
}

public class LibraryException {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter title of book: ");
            String bookTitle = scanner.nextLine();
            System.out.print("Enter author of the book: ");
            String bookAuthor = scanner.nextLine();

            System.out.print("Enter title of the magazine: ");
            String magazineTitle = scanner.nextLine();
            System.out.print("Enter issue number of the magazine: ");
            int magazineIssueNumber = scanner.nextInt();

            Book book = new Book(bookTitle, bookAuthor);
            Magazine magazine = new Magazine(magazineTitle, magazineIssueNumber);

            library.addItem(book);
            library.addItem(magazine);

            library.displayCollection();

            library.removeItem(book);

            System.out.println("\nAfter removing a book:");
            library.displayCollection();
        } catch (DuplicateBookException | DuplicateMagazineException | InvalidBookException | InvalidMagazineException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
