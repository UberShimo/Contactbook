package list;

import contacts.Company;
import contacts.Person;

import java.io.*;
import java.util.ArrayList;

public class Save {
    public static void savePersons(ArrayList<Person> list) throws IOException {
        try (ObjectOutputStream saver = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Persons.bin"))))) {
            saver.writeObject(list);//Save list to "Persons.bin".
        }
        catch (FileNotFoundException e) {

        }
    }

    public static void saveCompanies(ArrayList<Company> list) throws IOException {
        try (ObjectOutputStream saver = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Companies.bin"))))) {
            saver.writeObject(list);//Save list to "Companies.bin".
        } catch (FileNotFoundException e) {

        }
    }
}
