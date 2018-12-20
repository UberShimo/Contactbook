package contacts.test;

import contacts.Company;
import contacts.Contact;
import contacts.ContactChanger;
import contacts.Person;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactChangerTest {

    @Test
    void changePersonName() {
        //Helena test

        Contact contact = new Contact() {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public void setName(String firstName) {

            }

            @Override
            public String getPhoneNumber() {
                return null;
            }

            @Override
            public void setPhoneNumber(String phoneNumber) {

            }

            @Override
            public String getEmail() {
                return null;
            }

            @Override
            public void setEmail(String email) {

            }
        };

        System.out.println();
        System.out.println(contact.getName());
        System.out.println("---------------");
        System.out.println("Enter new name:");
        Person p = new Person("hej", "då", 0000000000);
        String name = "Glenn";

        if (name != null && !name.equals("")) {

            p.setName(name);

            System.out.println("Name changed");
            System.out.println();
        } else {
            System.out.println("Invalid name");
        }

        assertEquals("Glenn", p.getName());

    }

    @Test
    void changePersonEmail()
    {    //Robin test

        Person person = new Person("Robin", "Hansson", 756872345, "robin@mail.com");

        //Creating string to stream
        String simulatedUserInput = "3" + System.getProperty("line.separator")
                + "hansson@mail.com" + System.getProperty("line.separator") + "0" +
                System.getProperty("line.separator");

        //Creating stream and set it to System to simulate user input to the scanner
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        //Calling the method for changing person
        ContactChanger.changePersonInfo(person);

        //Testing with assertEquals
        assertEquals("hansson@mail.com", person.getEmail());

    }

    @Test
    void changePersonPhoneNumber()
    {    //Robin test

        Person person = new Person("Robin", "Hansson", 756872345, "robin@mail.com");

        //Creating string to stream
        String simulatedUserInput = "4" + System.getProperty("line.separator")
                + "0700234591" + System.getProperty("line.separator") + "0" +
                System.getProperty("line.separator");

        //Creating stream and set it to System to simulate user input to the scanner
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        //Calling the method for changing person
        ContactChanger.changePersonInfo(person);

        //Testing with assertEquals
        assertEquals("0700234591", person.getPhoneNumber());

    }

    @Test
    void changeCompanyName() {
        //Robin test

        Company company = new Company("gg", 776123987, "gg@mail.com");

        //Creating string to stream
        String simulatedUserInput = "1" + System.getProperty("line.separator")
                + "itw" + System.getProperty("line.separator") + "0" +
                System.getProperty("line.separator");

        //Creating stream and set it to System to simulate user input to the scanner
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        //Calling the method for changing company
        ContactChanger.changeCompanyInfo(company);

        //Testing with assertEquals
        assertEquals("itw", company.getName());

    }

    @Test
    void changeCompanyEmail()
    {    //Robin test

        Company company = new Company("gg", 776123987, "gg@mail.com");

        //Creating string to stream
        String simulatedUserInput = "2" + System.getProperty("line.separator")
                + "itw@mail.com" + System.getProperty("line.separator") + "0" +
                System.getProperty("line.separator");

        //Creating stream and set it to System to simulate user input to the scanner
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        //Calling the method for changing company
        ContactChanger.changeCompanyInfo(company);

        //Testing with assertEquals
        assertEquals("itw@mail.com", company.getEmail());

    }

    @Test
    void changeCompanyPhoneNumber(){
        //Robin test

        Company company = new Company("gg", 776123987, "gg@mail.com");

        //Creating string to stream
        String simulatedUserInput = "3" + System.getProperty("line.separator")
                + "0705872345" + System.getProperty("line.separator") + "0" +
                System.getProperty("line.separator");

        //Creating stream and set it to System to simulate user input to the scanner
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        //Calling the method for changing company
        ContactChanger.changeCompanyInfo(company);

        //Testing with assertEquals
        assertEquals("0705872345", company.getPhoneNumber());

    }
}
