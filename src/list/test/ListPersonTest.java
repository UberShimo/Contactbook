import contacts.Person;
import list.ListPerson;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class ListPersonTest {
    @Test
    void addAndRemoveTest(){
        //Simon och Helena test
        ListPerson lp = new ListPerson();

        String input = "Jocke\nBertsson\nMail@gmail.com\n1122334455";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        lp.addPerson();

        assertEquals(1, lp.getPersonList().size());

        lp.removePerson(1);

        assertEquals(0, lp.getPersonList().size());
    }

    @Test
    public void listPerson() {
        //Andreas test
        Person person = new Person("Benny", "Kla", 666666666);

        ArrayList<Person> personList = new ArrayList<>();

        Iterator<Person> it = personList.iterator();

        int i = 0;

        while (it.hasNext()) {

            System.out.println(i + 1 + ". " + it.next().toString());

            i++;

        }
        assertEquals("First-name: Benny.  Last-name: Kla.  Email: null.  Phone-number: 0666666666.  ", person.toString());
    }

    @Test
    public void findPerson(){
        //Andreas test
        Person person = new Person("Benny", "Kla", 666666666);

        ArrayList<Person> personList = new ArrayList<>();

        Iterator<Person> it = personList.iterator();

        System.out.println("Input name for search: ");

        String name = "Benny";

        int i = 0;

        while (it.hasNext()) {
            Person p = it.next();

            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println("Person found");

                System.out.println(i + 1 + ". " + p.toString());

                i++;
            }
        }
        assertEquals("First-name: Benny.  Last-name: Kla.  Email: null.  Phone-number: 0666666666.  ", person.toString());
    }
}