package list;

import contacts.Person;

import java.io.*;
import java.util.ArrayList;

public class Load {
    public static ArrayList<Person> load(){
        ArrayList<Person> list = null;
        File file = new File("Contacts.bin");

        if(file.exists()) {
            try (ObjectInputStream loader = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Contacts.bin")))) {
                list = (ArrayList<Person>) loader.readObject();
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        if( list != null) {
            return list;
        }
        return new ArrayList<Person>();
    }
}
