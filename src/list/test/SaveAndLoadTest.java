package list.test;

import contacts.Person;
import list.Load;
import list.Save;

import java.io.IOException;
import java.util.ArrayList;

public class SaveAndLoadTest {
    public static void main(String[] args) {
        ArrayList<Person> list = Load.load();

        Person p1 = new Person("Sven", "Göransson", "coolMail@gmail.com");
        Person p2 = new Person("Anna", "Hamdu", "nike@like.com");
        Person p3 = new Person("Fago", "Lebsson", "hetero@gaymail.se");

        list.add(p1);
        list.add(p2);
        list.add(p3);

        System.out.println(list.size());

        try {
            Save.save(list);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
