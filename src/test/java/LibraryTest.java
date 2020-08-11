import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTest {

    List<Book> bookList;
    PriorityQueue<User> borrowersQueue = new PriorityQueue<>();

    Library library;

    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;
    Book book7;

    @BeforeEach
    void setup() {

        bookList = new ArrayList<>();

        book1 = new Book("978-3-16-140100-0", "Things Fall Apart", "Chinua Achebe", 1500, "Novel", 0);
        book2 = new Book("767-3-16-140100-1", "Ulysses", "James Joyce", 1000, "Fiction", 0);
        book3 = new Book("222-3-16-140100-2", "One Hundred Years of Solitude", "Gabriel Garcia Marquez", 800, "Novel", 0);
        book4 = new Book("495-3-16-140100-3", "War and Peace", "Leo Tolstoy", 2000, "Novel", 0);
        book5 = new Book("495-3-16-140100-3", "War and Peace", "Leo Tolstoy", 2000, "Novel", 0);
        book6 = new Book("455-3-16-140100-5", "Java the Complete Reference", "Herbert Schildt", 3500, "Programming", 0);
        book7 = new Book("455-3-16-140100-5", "Java the Complete Reference", "Herbert Schildt", 3500, "Programming", 0);

        library = new Library(bookList);

        library.addBook(book7, book7.getTitle(), book7.getAuthor());
        library.addBook(book4, book4.getTitle(), book4.getAuthor());
        library.addBook(book5, book5.getTitle(), book5.getAuthor());
        library.addBook(book2, book2.getTitle(), book2.getAuthor());
    }

    @Test
    void addBook() {

        System.out.println(library.showCatalogue());

        // TODO: AssertEquals

    }

    @Test
    void joinQueue() {


//        library.lendBook("Ulysses", user1);
//        library.lendBook("Ulysses", user2);
//        library.lendBook("Ulysses", user3);

    }

    @Test
    void lendBook() {

        borrowersQueue.add(new User("John", "Fredo", "student", "junior", 3));
        borrowersQueue.add(new User("Lota", "Benard", "teacher", "nil", 1));
        borrowersQueue.add(new User("Tom", "Frank", "student", "senior", 2));
        borrowersQueue.add(new User("FredT", "Hayman", "teacher", "nil", 1));

        User user = borrowersQueue.peek();
        System.out.println("Top of the Queue: " + borrowersQueue.peek());

        System.out.println("Before Lending: \n" + library.showCatalogue());

        assertEquals("Successful. You have just issued a copy of Ulysses to Lota", library.lendBook("Ulysses", user));

        System.out.println("After Lending: \n" + library.showCatalogue());

    }

    @Test
    void returnBook() {

    }
}