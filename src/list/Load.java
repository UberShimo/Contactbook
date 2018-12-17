package list;

import contacts.Company;
import contacts.Person;

import java.io.*;
import java.util.ArrayList;

public class Load {
    public static ArrayList<Person> loadPersons(){
        ArrayList<Person> list = null;//Creates an empty list.
        File file = new File("Persons.bin");//Creates a path.

        //Check if there is a File in the path.
        if(file.exists()) {
            try (ObjectInputStream loader = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Persons.bin")))) {
                list = (ArrayList<Person>) loader.readObject();//Load from file to empty list.
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

        //Return list if list is not NULL
        if( list != null) {
            return list;
        }
        return new ArrayList<Person>();//Return an empty list.
    }

    public static ArrayList<Company> loadCompanies(){
        ArrayList<Company> list = null;//Creates an empty list.
        File file = new File("Companies.bin");//Creates a path.

        //Check if there is a File in the path.
        if(file.exists()) {
            try (ObjectInputStream loader = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Companies.bin")))) {
                list = (ArrayList<Company>) loader.readObject();//Load from file to empty list.
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

        //Return list if list is not NULL
        if( list != null) {
            return list;
        }
        return new ArrayList<Company>();//Return an empty list.
    }
}
