package contacts.test;

import contacts.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    void testToString() {
        //Robin test

        Person person = new Person("robin", "hansson", 705873456, "robin@mail.com" );

        String expected = "First-name: robin.  Last-name: hansson.  Email: robin@mail.com.  Phone-number: 0705873456.";

        //Testing with assertEquals
        assertEquals(expected, person.toString());
    }
}
