import list.ListPerson;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class ListPersonTest {
    @Test
    void addAndRemoveTest(){
        ListPerson lp = new ListPerson();

        String input = "Jocke\nBertsson\nMail@gmail.com\n1122334455";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        lp.addPerson();

        assertEquals(1, lp.getPersonList().size());

        lp.removePerson(1);

        assertEquals(0, lp.getPersonList().size());
    }
}