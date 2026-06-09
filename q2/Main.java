public class Main {

    static class Book {
        String title;
        String author;
        String isbn;

        Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        void display() {
            System.out.println(title + " | " + author + " | " + isbn);
        }

        static void addBook(Book[] books, Book b, int index) {
            books[index] = b;
        }

        static void removeBook(Book[] books, String isbn) {
            for (int i = 0; i < books.length; i++) {
                if (books[i] != null && books[i].isbn.equals(isbn)) {
                    books[i] = null;
                }
            }
        }
    }

    public static void main(String[] args) {

        Book[] books = new Book[3];

        Book.addBook(books, new Book("Java", "James", "101"), 0);
        Book.addBook(books, new Book("DBMS", "Navathe", "102"), 1);
        Book.addBook(books, new Book("DSA", "Mark", "103"), 2);

        System.out.println("Before Remove:");
        for (Book b : books) {
            if (b != null) {
                b.display();
            }
        }

        Book.removeBook(books, "102");

        System.out.println("\nAfter Remove:");
        for (Book b : books) {
            if (b != null) {
                b.display();
            }
        }
    }
}