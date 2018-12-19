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

        Iterator<Company> it = companyList.iterator();
        System.out.println("Input name for search: ");
        String name = sc.next();
        int i = 0;

        while (it.hasNext()) {

            Company p = it.next();
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println("Company found");
                System.out.println(i + 1 + ". " + p.toString());
                i++;
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
