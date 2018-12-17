package user;

import contacts.CreateContact;
import list.*;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    //initialized new scanner
    CreateContact c;
    ListPerson listPerson;
    ListCompany listCompany;

    public void start() {

        listPerson.setPersonList(Load.loadPersons());
        listCompany.setCompanyList(Load.loadCompanies());

        int menuType = 0;

        while (true) {
            if (menuType == 0) {
                System.out.println("============ CONTACT BOOK ============");
                System.out.println("\nWelcome to the contact book. Make a choice in the menu: \n");
                System.out.println("1. Person menu\n2. Company menu\n3. Exit");
                //printing the menu options
                switch (sc.nextInt()) {
                    //using a scanner to select options in menu and then using the switch
                    case 1:
                        menuType = 1;
                        break;
                    case 2:
                        menuType = 2;
                        break;
                    case 3:
                        try {
                            Save.savePersons(listPerson.getPersonList());
                        } catch (IOException e){
                            System.out.println("Error saving");
                        }
                        try {
                            Save.saveCompanies(listCompany.getCompanyList());
                        } catch (IOException e){
                            System.out.println("Error saving");
                        }
                        System.out.println("Saved changes");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Error! Make your choice between 1 or 2!");
                        break;
                }
            } else if ( menuType == 1 ){
                System.out.println("============ PERSON MENU ============");
                System.out.println("\nMake your choice in the menu: ");
                System.out.println("\n1. Create contact\n2. Remove contact\n3. Search contact\n4. View contact book\n" +
                        "5. Main menu\n6. Exit");
                switch (sc.nextInt()){
                    case 1:
                        listPerson.addPerson();
                        break;
                    case 2:
                        listPerson.listPerson();
                        System.out.println("Choose which index you want to remove: ");
                        int pos = sc.nextInt();
                        listPerson.removePerson(pos);
                        break;
                    case 3:
                        listPerson.findPerson();
                        break;
                    case 4:
                        listPerson.listPerson();
                        break;
                    case 5:
                        menuType = 0;
                        break;
                    case 6:
                        //save
                        System.out.println("Saved changes");
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            } else if ( menuType == 2) {
                System.out.println("============ COMPANY MENU ============");
                System.out.println("\nMake your choice in the menu: ");
                System.out.println("\n1. Create contact\n2. Remove contact\n3. Search contact\n4. View contact book\n" +
                        "5. Main menu\n6. Exit");
                switch (sc.nextInt()) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        menuType = 0;
                        break;
                    case 6:
                        //save
                        System.out.println("Saved changes");
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            }

        }
    }
}
//lägg spara i slutet av loopen istället för att upprepa