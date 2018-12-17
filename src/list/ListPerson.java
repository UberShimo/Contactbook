package list;


import contacts.Company;
import contacts.CreateContact;
import contacts.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListPerson {
    static ArrayList<Person> personList = new ArrayList<Person>();

    public void listPerson() {

        Iterator<Person> it = personList.iterator();
        int i = 1;
        while (it.hasNext()) {
            System.out.println(i + ". " + it.next().toString());
            i++;
        }
    }


    public static void remove(ArrayList<Person> list, Person p) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(p)) {
                list.remove(i);
                break;
            }
        }
    }

    public static void remove(ArrayList<Person> list, int i) {
        list.remove(i);
    }

    public static void addPerson(){

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
                System.out.println(i + ". " + p.toString());
                i++;
            }

        }
    }
}

