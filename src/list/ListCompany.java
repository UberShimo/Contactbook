package list;

import contacts.Company;
import contacts.CreateContact;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListCompany implements Serializable {

    ArrayList<Company> companyList = new ArrayList<Company>();

    public void listCompany(){

        Iterator<Company> itc = companyList.iterator();
        int i = 0;
        while (itc.hasNext()){
            System.out.println(i + 1 + ". " + itc.next().toString());
            i++;
        }
    }

    public void addCompany()
    {
        Company company;

        company = CreateContact.createCompany();

        companyList.add(company);
    }

    public void findCompany() {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        Iterator<Company> it = companyList.iterator();
        System.out.println("Input name for search: ");
        String name = sc.next();
        int i = 0;

        while (it.hasNext()) {

            Company p = it.next();
            if (p.getCompanyName().equalsIgnoreCase(name)) {
                System.out.println("Company found");
                System.out.println(i + 1 + ". " + p.toString());
                i++;
            }

        }
    }

    public void removeCompany(int position) {

        companyList.remove(position - 1);
        System.out.println("Company removed from list");
        System.out.println();
    }
}
