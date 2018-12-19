package list;


import contacts.ContactChanger;
import contacts.CreateContact;
import contacts.Person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListPerson implements Serializable {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Person> personList = new ArrayList<>();

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void listPerson() {

        Iterator<Person> it = personList.iterator();
        int i = 0;
        while (it.hasNext()) {
            System.out.println(i + 1 + ". " + it.next().toString());
            i++;
        }
    }

    public void addPerson(){

        Person person;

        person = CreateContact.createPerson();

        personList.add(person);
    }

    public void findPerson() {

        Iterator<Person> it = personList.iterator();
        System.out.println("Input name for search: ");
        String name = sc.next();
        int i = 0;

        while (it.hasNext()) {

            Person p = it.next();
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println("Person found");
                System.out.println(i + 1 + ". " + p.toString());
                i++;
            }
        }
    }

    public void removePerson(int position) {

        personList.remove(position - 1);////Remove a person from person list.
        System.out.println("Person removed from list");//Print "Person removed from list" in console.
        System.out.println();
    }

    public void changePersonInfo(int position)
    {
        Person person = personList.get(position - 1);
        ContactChanger.changePersonInfo(person);
    }
}

