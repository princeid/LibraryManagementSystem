import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTest {

    List<Book> bookList;

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
    }

    @Test
    void addBook() {

        assertAll(
                () -> assertEquals("Successful. There're now 1 copy of 'Java the Complete Reference' in the library.", library.addBook(book6, book6.getTitle(), book6.getAuthor())),
                () -> assertEquals("Successful. There're now 2 copies of 'Java the Complete Reference' in the library.", library.addBook(book6,
                        book6.getTitle(), book6.getAuthor())),
                () -> assertEquals("Successful. There're now 1 copy of 'One Hundred Years of Solitude' in the library.", library.addBook(book3, book3.getTitle(), book3.getAuthor()))
        );

//        System.out.println("Catalogue: \n" + library.showCatalogue());

    }

    @Test
    void lendBookImplementation1() {

        library.addBook(book7, book7.getTitle(), book7.getAuthor());
        library.addBook(book4, book4.getTitle(), book4.getAuthor());
        library.addBook(book5, book5.getTitle(), book5.getAuthor());
        library.addBook(book2, book2.getTitle(), book2.getAuthor());

        library.normalQueue.add(new User("John", "Fredo", "student", "junior", 3));
        library.normalQueue.add(new User("Lota", "Benard", "teacher", "nil", 1));
        library.normalQueue.add(new User("Tom", "Frank", "student", "senior", 2));
        library.normalQueue.add(new User("FredT", "Hayman", "teacher", "nil", 1));

        assertEquals("You have just issued a copy of Ulysses to Lota", library.lendBookImplementation1("Ulysses"));

    }

    @Test
    void lendBookImplementation2() {

        library.addBook(book7, book7.getTitle(), book7.getAuthor());
        library.addBook(book4, book4.getTitle(), book4.getAuthor());
        library.addBook(book5, book5.getTitle(), book5.getAuthor());
        library.addBook(book2, book2.getTitle(), book2.getAuthor());

        library.normalQueue.add(new User("John", "Fredo", "student", "junior", 3));
        library.normalQueue.add(new User("Lota", "Benard", "teacher", "nil", 1));
        library.normalQueue.add(new User("Tom", "Frank", "student", "senior", 2));
        library.normalQueue.add(new User("FredT", "Hayman", "teacher", "nil", 1));

        assertEquals("You have just issued a copy of Ulysses to John", library.lendBookImplementation2("Ulysses"));
    }

    @Test
    void showCatalogue() {

        library.addBook(book5, book5.getTitle(), book5.getAuthor());
        library.addBook(book2, book2.getTitle(), book2.getAuthor());

        assertEquals("Title: War and Peace\n" + "Author: Leo Tolstoy\n" + "Genre: Novel\n" + "Available: 1\n" + "\n" +
                "Title: Ulysses\n" + "Author: James Joyce\n" + "Genre: Fiction\n" + "Available: 1\n" + "\n",
                library.showCatalogue());

    }
}