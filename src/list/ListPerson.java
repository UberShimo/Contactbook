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

        Iterator<Person> it = personList.iterator();//Creates itherator for personList.
        int i = 0;// Int variable for the index.
        while (it.hasNext()) {//While the itherator (list) has another object do.
            System.out.println(i + 1 + ". " + it.next().toString());//Prints the index i and the toString for the person.
            i++;//Adds 1 to the index indicator.
        }
    }

    public void addPerson(){

        Person person;

        person = CreateContact.createPerson();

        personList.add(person);
    }

    public void findPerson() {

        Iterator<Person> it = personList.iterator();// Creates an iterator for personList
        System.out.println("Input name for search: ");//Prints "Input name for search" to console
        String name = sc.next();//User input using scanner for the name.
        int i = 0;//An int to show the index of the object

        while (it.hasNext()) {//While the list has another object do.

            Person p = it.next();
            if (p.getName().equalsIgnoreCase(name)) {//If the name in the list is the same as searched do.
                System.out.println("Person found");//Prints "Company found" to console.
                System.out.println(i + 1 + ". " + p.toString());//Prints the index of the person found and the to string for the person.
                i++;//Adds 1 to the index i.
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

