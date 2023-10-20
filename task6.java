import java.util.ArrayList;

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

    public String getType() {
        return "Magazine";
    }

    public String toString() {
        return super.toString() + ", Issue Number: " + issueNumber;
    }
}

class Library {
    private ArrayList<Item> collection = new ArrayList<>();

    public void addItem(Item item) {
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

public class task6 {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("Java Programming", "James");
        Magazine magazine = new Magazine("Technology", 11);

        library.addItem(book);
        library.addItem(magazine);

        library.displayCollection();

        library.removeItem(book);

        System.out.println("\nAfter removing a book:");
        library.displayCollection();
    }
}




