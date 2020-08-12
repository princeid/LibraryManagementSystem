import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    Book book;

    @BeforeEach
    void setup() {
        book = new Book("222-3-16-140100-2", "One Hundred Years of Solitude", "Gabriel Garcia Marquez", 1800, "Novel", 0);
    }

    @Test
    void getIsbn() {
        assertEquals("222-3-16-140100-2", book.getIsbn());
    }

    @Test
    void getTitle() {
        assertEquals("One Hundred Years of Solitude", book.getTitle());
    }

    @Test
    void getAuthor() {
        assertEquals("Gabriel Garcia Marquez", book.getAuthor());
    }

    @Test
    void getPrice() {
        assertEquals(1800, book.getPrice());
    }

    @Test
    void getGenre() {
        assertEquals("Novel", book.getGenre());
    }

    @Test
    void getCount() {
        assertEquals(0, book.getCount());
    }
}