package list;

import contacts.Company;
import contacts.ContactChanger;
import contacts.CreateContact;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListCompany implements Serializable {

    private ArrayList<Company> companyList = new ArrayList<>();

    public ArrayList<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(ArrayList<Company> companyList) {
        this.companyList = companyList;
    }

    public void listCompany(){

        Iterator<Company> itc = companyList.iterator();//Creates itherator for companyList.
        int i = 0;// Int variable for the index.
        while (itc.hasNext()){//While the itherator (list) has another object do.
            System.out.println(i + 1 + ". " + itc.next().toString());//Prints the index i and the toString for the person.
            i++;//Adds 1 to the index indicator.
        }
    }

    public void addCompany()
    {
        Company company;

        company = CreateContact.createCompany();

        companyList.add(company);
    }

    public void findCompany() {
        Scanner sc = new Scanner(System.in);//Initiation for scanner called sc.

        Iterator<Company> it = companyList.iterator(); // Creates an iterator for companyList
        System.out.println("Input name for search: "); //Prints "Input name for search" to console
        String name = sc.next();//User input using scanner for the name.
        int i = 0;//An int to show the index of the object

        while (it.hasNext()) {//While the list has another object do.

            Company p = it.next();
            if (p.getName().equalsIgnoreCase(name)) {//If the name in the list is the same as searched do.
                System.out.println("Company found"); //Prints "Company found" to console.
                System.out.println(i + 1 + ". " + p.toString());//Prints the index of the person found and the to string for the person.
                i++;//Adds 1 to the index i.
            }
        }
    }

    public void removeCompany(int position) {

        companyList.remove(position - 1);//Remove a company from company list.
        System.out.println("Company removed from list");//Print "Company removed from list" in console.
        System.out.println();
    }

    public void changeCompanyInfo(int position)
    {
        Company company = companyList.get(position - 1);
        ContactChanger.changeCompanyInfo(company);
    }
}
