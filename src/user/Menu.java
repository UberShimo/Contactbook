package user;

import list.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static Scanner sc = new Scanner(System.in);
    //initialized new scanner
    private static ListPerson listPerson = new ListPerson();
    private static ListCompany listCompany = new ListCompany();

    public void start() {

        int menuType = 0;
        int pos;

        listPerson.setPersonList(Load.loadPersons());
        listCompany.setCompanyList(Load.loadCompanies());

        while (true) {
            try {
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
                            saveLists();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Error! Make your choice between 1, 2 or 3!");
                            break;
                    }

                } else if (menuType == 1) {
                    System.out.println("============ PERSON MENU ============");
                    System.out.println("\nMake your choice in the menu: ");
                    System.out.println("\n1. Create contact\n2. Remove contact\n3. Search contact\n4. View contact book\n" +
                            "5. Change contact-info\n6. Save changes\n7. Main menu\n8. Exit");
                    switch (sc.nextInt()) {
                        case 1:
                            listPerson.addPerson();
                            break;
                        case 2:
                            System.out.println("Choose which index you want to remove: ");
                            listPerson.listPerson();
                            pos = sc.nextInt();
                            listPerson.removePerson(pos);
                            break;
                        case 3:
                            listPerson.findPerson();
                            break;
                        case 4:
                            listPerson.listPerson();
                            break;
                        case 5:
                            System.out.println("Choose which index you want to change: ");
                            listPerson.listPerson();
                            pos = sc.nextInt();
                            listPerson.changePersonInfo(pos);
                            break;
                        case 6:
                            saveLists();
                            break;
                        case 7:
                            menuType = 0;
                            break;
                        case 8:
                            saveLists();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Error! Only choose an option from the menu");
                            break;
                    }
                } else {
                    System.out.println("============ COMPANY MENU ============");
                    System.out.println("\nMake your choice in the menu: ");
                    System.out.println("\n1. Create contact\n2. Remove contact\n3. Search contact\n4. View contact book\n" +
                            "5. Change contact-info\n6. Save changes\n7. Main menu\n8. Exit");
                    switch (sc.nextInt()) {
                        case 1:
                            listCompany.addCompany();
                            break;
                        case 2:
                            System.out.println("Choose which index you want to remove: ");
                            listCompany.listCompany();
                            pos = sc.nextInt();
                            listCompany.removeCompany(pos);
                            break;
                        case 3:
                            listCompany.findCompany();
                            break;
                        case 4:
                            listCompany.listCompany();
                            break;
                        case 5:
                            System.out.println("Choose which index you want to change: ");
                            listCompany.listCompany();
                            pos = sc.nextInt();
                            listCompany.changeCompanyInfo(pos);
                            break;
                        case 6:
                            saveLists();
                            break;
                        case 7:
                            menuType = 0;
                            break;
                        case 8:
                            saveLists();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Error! Only choose an option from the menu");
                            break;
                    }
                }
            } catch (InputMismatchException e){
                System.out.println("Error! Only numbers are valid as input!");
                sc.next();
                continue;
            }
        }
    }

    private static void saveLists()
    {
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
    }
}
