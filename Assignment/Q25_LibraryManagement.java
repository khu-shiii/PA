import java.util.*;

class Book {
    int id;
    String name;
    boolean issued;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
        this.issued = false;
    }

    void display() {
        System.out.println(id + " - " + name);
    }
}

class Library {

    ArrayList<Book> books = new ArrayList<>();

    void addBook(int id, String name) {
        books.add(new Book(id, name));
        System.out.println("Book added");
    }

    void issueBook(int id) {

        for (Book b : books) {

            if (b.id == id) {

                if (!b.issued) {
                    b.issued = true;
                    System.out.println("Book issued");
                }
                else {
                    System.out.println("Book already issued");
                }

                return;
            }
        }

        System.out.println("Book not found");
    }

    void returnBook(int id) {

        for (Book b : books) {

            if (b.id == id) {

                if (b.issued) {
                    b.issued = false;
                    System.out.println("Book returned");
                }
                else {
                    System.out.println("Book was not issued");
                }

                return;
            }
        }

        System.out.println("Book not found");
    }

    void displayAvailableBooks() {

        System.out.println("Available Books:");

        for (Book b : books) {

            if (!b.issued) {
                b.display();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(1, "Java");
        library.addBook(2, "Python");
        library.addBook(3, "DSA");

        library.displayAvailableBooks();

        library.issueBook(2);

        library.displayAvailableBooks();

        library.returnBook(2);

        library.displayAvailableBooks();
    }
}