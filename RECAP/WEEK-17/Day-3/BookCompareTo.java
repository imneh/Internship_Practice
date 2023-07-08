
import java.util.*;

class Book implements Comparable<Book>

    {

        String title;

        String author;

        String isbn;

        double price;

        Book(String title,String author,String isbn,double price)

        {

            this.title=title;

            this.author=author;

            this.isbn=isbn;

            this.price=price;

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

        public String getIsbn()

        {

            return isbn;

        }

        public void setIsbn(String isbn)

        {

            this.isbn=isbn;

        }

        public double getPrice() {

            return price;

        }

        public void setPrice(double price) {

            this.price = price;

        }

        public String toString()

        {

            return "(Book Title: "+title+", Author: "+author+", isbn: "+isbn+", Price: "+price+")";

        }

      
        public int compareTo(Book b)

        {

            return this.isbn.compareTo(b.getIsbn());

        }

        Book()

        {


        }

    }


 

// Create a class called "BookManager" to manage the books. It should have the following methods:
// addBook(Book book): Adds a book to the ArrayList.

// deleteBook(String isbn): Deletes a book from the ArrayList based on the ISBN number.

// updateBook(String isbn, Book newBook): Updates the details of a book with the given ISBN number.

// searchByTitle(String title): Searches for a book by the title and returns a list of matching books.

// searchByAuthor(String author): Searches for a book by the author and returns a list of matching books.

// displayAllBooks(): Displays the details of all the books in the ArrayList.

class BookManager

    {

        Scanner sc=new Scanner(System.in);

        ArrayList<Book> books=new ArrayList<>();

        void addBook(Book book)

        {

            books.add(book);

        }

        void deleteBook(String isbn)

        {

            boolean found=false;

            for(Book book:books)

                {

                    if(isbn.equals(book.getIsbn()))

                    {

                        books.remove(book);

                        found=true;

                        break;

                    }

                }

            if(found)

                System.out.println("Book deleted");

            else 

                System.out.println("Book Not Found");

        }

        void updateBook(String isbn, Book newBook)

        {

            boolean found=false;

            int index=0;

            for(Book book:books)

                {


                    if(isbn.equals(book.getIsbn()))

                    {

                        books.set(index,newBook);

                        found=true;

                        break;

                    }

                    index++;

                }

            if(found)

                System.out.println("Book updated");

            else 

                System.out.println("Book Not Found");

        }

        void searchByTitle(String title)

        {

            boolean found=false;

            for(Book book:books)

                {

                    if(title.equals(book.getTitle()))

                    {

                        System.out.println(book);

                        found=true;

                        break;

                    }

                }

            if(!found)

                System.out.println("Book Not Found");

        }

        void searchByAuthor(String author)

        {

            boolean found=false;

            for(Book book:books)

                {

                    if(author.equals(book.getAuthor()))

                    {

                        System.out.println(book);

                        found=true;

                        break;

                    }

                }

            if(!found)

                System.out.println("Book Not Found");

        }

        void displayAllBooks()

        {

            if(books.size()==0)

            {

                System.out.println("No Books to Display");

            }

            else 

            {

                for(Book book:books)

                    System.out.println(book);

            }

        }

        void sortAllBooks()

        {

            Collections.sort(books);

            for(Book itr:books)

            {

                System.out.println(itr);

            }

        }

    }

 

class BookCompareTo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        BookManager ob = new BookManager();

        Book book=null;

        int opt;

        do {

            System.out.println("1.Add Book\n" + "2.delete Book\n" + "3.update book\n" + "4.search by title\n"

                    + "5.search by Author\n" + "6.Display All Books\n"+ "7.Sort All Books\n"  + "8.Exit");

            System.out.println("choose the option");

            opt = sc.nextInt();

            switch (opt) {

                case 1:

                    book = bookDetails();

                    ob.addBook(book);

                    break;

                case 2:

                    System.out.println("Enter isbn to delete book");

                    String isbnNum = sc.next();

                    ob.deleteBook(isbnNum);

                    break;

                case 3:

                    System.out.println("Enter isbn to update book");

                    isbnNum = sc.next();

                    System.out.println("enter book detals to update");

                    book = bookDetails();

                    ob.updateBook(isbnNum, book);

                    break;

                case 4:

                    System.out.println("Enter book title to search");

                    String title=sc.next();

                    ob.searchByTitle(title);

                    break;

                case 5:

                    System.out.println("Enter book Author to search");

                    String author=sc.next();

                    ob.searchByAuthor(author);

                    break;

                case 6:

                    ob.displayAllBooks();

                    break;

                case 7: 

                    ob.sortAllBooks();

                    break;

                case 8: 

                    System.exit(0);

                    break;

                default :

                    System.out.println("Enter valid option(1-7)");

                    break;

            }

        } while (opt != 6);

    }

    static Book bookDetails() {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Book Name");

        String title = sc.next();

        System.out.println("Enter Author");

        String author = sc.next();

        System.out.println("Enter isbn");

        String isbn = sc.next();

        System.out.println("Enter Book Price");

        double price = sc.nextDouble();

        return new Book(title, author, isbn, price);

    }

}