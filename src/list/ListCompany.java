package list;

import contacts.Company;

import java.util.ArrayList;
import java.util.Iterator;

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
}
