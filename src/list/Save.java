package list;

import contacts.Person;

import java.io.*;
import java.util.ArrayList;

public class Save {
    public static void save(ArrayList<Person> list) throws IOException {
        try (ObjectOutputStream saver = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Contacts.bin"))))) {
            saver.writeObject(list);
        }
        catch (FileNotFoundException e) {

        }
    }
}
