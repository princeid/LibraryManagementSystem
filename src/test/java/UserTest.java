import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    @BeforeEach
    void setup() {
        user = new User("Prince", "Dickson", "student", "senior", 2);
    }

    @Test
    void getFirstName() {
        assertEquals("Prince", user.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Dickson", user.getLastName());
    }

    @Test
    void getOccupation() {
        assertEquals("student", user.getOccupation());
    }

    @Test
    void getLevel() {
        assertEquals("senior", user.getLevel());
    }

    @Test
    void getValue() {
        assertEquals(2, user.getValue());
    }
}