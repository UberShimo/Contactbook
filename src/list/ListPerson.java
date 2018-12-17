package list;


import contacts.Company;
import contacts.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListPerson {
    ArrayList<Person> personList = new ArrayList<Person>();

    public void listPerson() {

        Iterator<Person> it = personList.iterator();
        int i = 1;
        while (it.hasNext()) {
            System.out.println(i + ". " + it.next().toString());
            i++;
        }
    }



    public static void remove(ArrayList<Person> list, Person p){
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(p)) {
                list.remove(i);
                break;
            }
        }
    }

    public static void remove(ArrayList<Person> list, int i){
        list.remove(i);
    }

    public static void addPerson(ArrayList<Person> list, Person p){
        list.add(p);
    }

    public void find(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Vill du söka på 1. Person eller 2. Företag?");
        int val = sc.nextInt();

        if (val == 1) {
            Iterator<Person> it = personList.iterator();
            System.out.println("Skriv in namn för sökning: ");
            String name = sc.next();
            int i = 0;

            while (it.hasNext()){

                Person p = it.next();
                if (p.getFirstName().equalsIgnoreCase(name)){
                    System.out.println(i + ". "+ p.toString());
                    i++;
                }
            }
        }
        if (val == 2) {
            Iterator<Company> it = list.businessList.iterator();
            System.out.println("Skriv in namn för sökning: ");
            String name = sc.next();
            int i = 0;

            while (it.hasNext()){

                Company b = it.next();
                if (b.getCompanyName().equalsIgnoreCase(name)){
                    System.out.println(i + ". "+ b.toString());
                    i++;
                }
            }
        }
        else find();
    }
}

