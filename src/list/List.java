package list;


import contacts.Company;
import contacts.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    ArrayList<Person> personList = new ArrayList<Person>();

    public void listPerson() {

        Iterator<Person> it = personList.iterator();
        int i = 1;
        while (it.hasNext()) {
            System.out.println(i + ". " + it.next().toString());
            i++;
        }
    }


    ArrayList<Company> businessList = new ArrayList<Company>();

    public void listBusiness(){

        Iterator<Company> itc = businessList.iterator();
        int i = 1;
        while (itc.hasNext()){
            System.out.println(i + ". " + itc.next().toString());
            i++;
        }
    }
}
