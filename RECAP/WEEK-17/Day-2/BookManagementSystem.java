import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;
    
    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }
    
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
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Price: " + price;
    }
}
class BookManager {
    private List<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getIsbn().equals(isbn)) {
                books.remove(i);
                break;
            }
        }
    }

    public void updateBook(String isbn, Book newBook) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getIsbn().equals(isbn)) {
                books.set(i, newBook);
                break;
            }
        }
    }

    public List<Book> searchByTitle(String title) {
        List<Book> matchingBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> matchingBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public List<Book> getBooks() {
        return books;
    }
}
public class BookManagementSystem {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adding Books");
        System.out.println("Enter the number of books to add:");
        int numBooks = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 1; i <= numBooks; i++) {
            System.out.println("Enter the details for Book " + i);
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); 
            Book book = new Book(title, author, isbn, price);
            bookManager.addBook(book);
            System.out.println("Book added successfully.\n");
        }

        System.out.println();

        System.out.println("All Books:");
        bookManager.displayAllBooks();
        System.out.println();

        System.out.println("Search by Title");
        System.out.print("Enter the title to search: ");
        String searchTitle = scanner.nextLine();
        List<Book> matchingTitles = bookManager.searchByTitle(searchTitle);
        if (matchingTitles.isEmpty()) {
            System.out.println("No books found with the title \"" + searchTitle + "\"\n");
        } else {
            System.out.println("Books with title \"" + searchTitle + "\":");
            for (Book book : matchingTitles) {
                System.out.println(book);
            }
            System.out.println();
        }

        System.out.println("Search by Author");
        System.out.print("Enter the author to search: ");
        String searchAuthor = scanner.nextLine();
        List<Book> matchingAuthors = bookManager.searchByAuthor(searchAuthor);
        if (matchingAuthors.isEmpty()) {
            System.out.println("No books found by author \"" + searchAuthor + "\"\n");
        } else {
            System.out.println("Books by author \"" + searchAuthor + "\":");
            for (Book book : matchingAuthors) {
                System.out.println(book);
            }
            System.out.println();
        }
        System.out.println("Update Book Details");
        System.out.print("Enter the ISBN of the book to update: ");
        String updateIsbn = scanner.nextLine();
        Book bookToUpdate = null;
        for (Book book : bookManager.getBooks()) {
            if (book.getIsbn().equals(updateIsbn)) {
                bookToUpdate = book;
                break;
            }
        }

        if (bookToUpdate != null) {
            System.out.println("Enter the new details for the book with ISBN \"" + updateIsbn + "\"");
            System.out.print("New Title: ");
            String newTitle = scanner.nextLine();
            System.out.print("New Author: ");
            String newAuthor = scanner.nextLine();
            System.out.print("New Price: ");
            double newPrice = scanner.nextDouble();
            scanner.nextLine(); 
            Book newBook = new Book(newTitle, newAuthor, updateIsbn, newPrice);
            bookManager.updateBook(updateIsbn, newBook);
            System.out.println("Book updated successfully.\n");
        } else {
            System.out.println("Book with ISBN \"" + updateIsbn + "\" not found.\n");
        }

        System.out.println("Delete a Book");
        System.out.print("Enter the ISBN of the book to delete: ");
        String deleteIsbn = scanner.nextLine();
        bookManager.deleteBook(deleteIsbn);
        System.out.println("Book with ISBN \"" + deleteIsbn + "\" deleted successfully.\n");
      System.out.println("All Books after deletion and update:");
        bookManager.displayAllBooks();

        
    }
}