package list;


import contacts.Company;
import contacts.CreateContact;
import contacts.Person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListPerson implements Serializable {
    ArrayList<Person> personList = new ArrayList<Person>();

    public void listPerson() {

        Iterator<Person> it = personList.iterator();
        int i = 0;
        while (it.hasNext()) {
            System.out.println(i + 1 + ". " + it.next().toString());
            i++;
        }
    }


    public void removePerson(int position) {

        personList.remove(position - 1);
        System.out.println("Person removed from list");
        System.out.println();
    }

    public void addPerson(){

        Person person;

        person = CreateContact.createPerson();

        personList.add(person);
    }

    public void findPerson() {

        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        Iterator<Person> it = personList.iterator();
        System.out.println("Input name for search: ");
        String name = sc.next();
        int i = 0;

        while (it.hasNext()) {

            Person p = it.next();
            if (p.getFirstName().equalsIgnoreCase(name)) {
                System.out.println("Person found");
                System.out.println(i + 1 + ". " + p.toString());
                i++;
            }

        }
    }
}

