package list;

import contacts.Company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListCompany {

    ArrayList<Company> businessList = new ArrayList<Company>();

    public void listBusiness(){

        Iterator<Company> itc = businessList.iterator();
        int i = 1;
        while (itc.hasNext()){
            System.out.println(i + ". " + itc.next().toString());
            i++;
        }
    }

    public void findCompany() {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        Iterator<Company> it = businessList.iterator();
        System.out.println("Input name for search: ");
        String name = sc.next();
        int i = 0;

        while (it.hasNext()) {

            Company p = it.next();
            if (p.getCompanyName().equalsIgnoreCase(name)) {
                System.out.println(i + ". " + p.toString());
                i++;
            }

        }
    }
}
