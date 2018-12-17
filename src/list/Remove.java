package list;

import contacts.Company;
import contacts.Person;
import java.util.ArrayList;

public class Remove {
    public static void removePerson(ArrayList<Person> list, Person p){
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(p)) {
                list.remove(i);
                break;
            }
        }
    }

    public static void removePerson(ArrayList<Person> list, int i){
        list.remove(i);
    }

    public static void removeCompany(ArrayList<Company> list, Company c){
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(c)) {
                list.remove(i);
                break;
            }
        }
    }

    public static void removeCompany(ArrayList<Company> list, int i){
        list.remove(i);
    }
}
