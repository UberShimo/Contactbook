import list.ListCompany;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class ListCompanyTest {
    @Test
    void addAndRemoveTest(){
        ListCompany lc = new ListCompany();

        String input = "GoodComp\nMail@gmail.com\n1122334455";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        lc.addCompany();

        assertEquals(1, lc.getCompanyList().size());

        lc.removeCompany(1);

        assertEquals(0, lc.getCompanyList().size());
    }
}