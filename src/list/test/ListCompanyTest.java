import contacts.Company;
import list.ListCompany;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class ListCompanyTest {
    @Test
    void addAndRemoveTest(){
        //Simon och Helena test
        ListCompany lc = new ListCompany();

        String input = "GoodComp\nMail@gmail.com\n1122334455";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        lc.addCompany();

        assertEquals(1, lc.getCompanyList().size());

        lc.removeCompany(1);

        assertEquals(0, lc.getCompanyList().size());
    }

    @Test
    public void listCompany() {
        //Andreas test
        Company company = new Company("Benny", 666666666, "benny@gmail.com" );

        ArrayList<Company> companyList = new ArrayList<>();

        Iterator<Company> it = companyList.iterator();

        int i = 0;

        while (it.hasNext()) {

            System.out.println(i + 1 + ". " + it.next().toString());

            i++;

        }
        assertEquals("Company-name: Benny.  Email: benny@gmail.com.  Phone-number: 0666666666.  ", company.toString());
    }

    @Test
    public void findCompany() {
        //Andreas test
        Company company = new Company("Benny", 666666666, "benny@gmail.com");

        ArrayList<Company> companyList = new ArrayList<>();

        Iterator<Company> it = companyList.iterator();

        System.out.println("Input name for search: ");

        String name = "Benny";

        int i = 0;

        while (it.hasNext()) {
            Company p = it.next();

            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println("Person found");

                System.out.println(i + 1 + ". " + p.toString());

                i++;
            }
        }
        assertEquals("Company-name: Benny.  Email: benny@gmail.com.  Phone-number: 0666666666.  ", company.toString());
    }
}