package contacts.test;

import contacts.Company;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyTest {

    @Test
    void testToString() {
        //Robin test

        Company company = new Company("gg", 705873456, "gg@mail.com" );

        String expected = "Company-name: gg.  Email: gg@mail.com.  Phone-number: 0705873456.";

        //Testing with assertEquals
        assertEquals(expected, company.toString());
    }
}
