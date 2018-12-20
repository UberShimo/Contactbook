package contacts.test;

import contacts.Company;
import contacts.CreateContact;
import contacts.Person;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateContactTest {

    @Test
    void testCreatePerson() {
        //Robin test

        Person person;

        //Creating string to stream
        String simulatedUserInput = "robin" + System.getProperty("line.separator")
                + "hansson" + System.getProperty("line.separator") + "robin@mail.com" +
                System.getProperty("line.separator") + "0709553322" + System.getProperty("line.separator");

        //Creating stream and set it to System to simulate user input to the scanner
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        //Calling the method for creating person
        person = CreateContact.createPerson();

        assertEquals("robin", person.getName());
        assertEquals("hansson", person.getLastName());
        assertEquals("robin@mail.com", person.getEmail());
        assertEquals("0709553322", person.getPhoneNumber());

    }

    @Test
    void testCreateCompany() {
        //Robin test

        Company company;

        //Creating string to stream
        String simulatedUserInput = "gg" + System.getProperty("line.separator") + "gg@mail.com" +
                System.getProperty("line.separator") + "0736871290" + System.getProperty("line.separator");

        //Creating stream and set it to System to simulate user input to the scanner
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        //Calling the method for creating company
        company = CreateContact.createCompany();

        //Testing with assertEquals
        assertEquals("gg", company.getName());
        assertEquals("gg@mail.com", company.getEmail());
        assertEquals("0736871290", company.getPhoneNumber());
    }
}
