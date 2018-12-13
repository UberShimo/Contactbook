package list.test;

import contacts.Person;
import list.Load;
import list.Save;

import java.io.IOException;
import java.util.ArrayList;

public class LoadAndSaveTest {
    public static void main(String[] args) {
        ArrayList<Person> list = Load.load();

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

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
