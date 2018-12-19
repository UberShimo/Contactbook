import contacts.Company;
import contacts.Person;
import list.Load;
import list.Save;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SaveAndLoadTest {
    ArrayList<Person> pList = new ArrayList<>();
    ArrayList<Company> cList = new ArrayList<>();

    @Test
    void test(){
        pList.add(new Person("Lars", "Bergqwist", 707338822, "CoolGuy@gmail.com"));
        cList.add(new Company("BigBois", 707331122, "BB@gaymail.cum"));

        try {
            Save.savePersons(pList);
            Save.saveCompanies(cList);
        }
        catch (IOException e){
            e.printStackTrace();
        }

        assertEquals("Lars", Load.loadPersons().get(pList.size()-1).getName());
        assertEquals("BigBois", Load.loadCompanies().get(cList.size()-1).getName());

        assertEquals(pList.size(), 1);
        assertEquals(cList.size(), 1);
    }
}