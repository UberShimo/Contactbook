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
    //creates an object of ListPerson & ListCompany

    public void start() {

        int menuType = 0;
        //the variable menutype has a different vale depending on what menu u are in
        int pos;

        listPerson.setPersonList(Load.loadPersons());
        listCompany.setCompanyList(Load.loadCompanies());
        //Calling for the load method. Loads the saved lists

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
                            //this calls for the person menu
                            break;
                        case 2:
                            menuType = 2;
                            //this calls for the company menu
                            break;
                        case 3:
                            saveLists();
                            System.exit(0);
                            //Calls for save method before u exit the program
                            break;
                        default:
                            System.out.println("Error! Make your choice between 1, 2 or 3!");
                            //If ur input is not a number between 1-3 this messages i shown
                            break;
                    }

                } else if (menuType == 1) {
                    //if the input above is 1 u will go here
                    System.out.println("============ PERSON MENU ============");
                    System.out.println("\nMake your choice in the menu: ");
                    System.out.println("\n1. Create contact\n2. Remove contact\n3. Search contact\n4. View contact book\n" +
                            "5. Change contact-info\n6. Save changes\n7. Main menu\n8. Exit");
                    switch (sc.nextInt()) {
                        case 1:
                            listPerson.addPerson();
                            //calls for the addPerson method
                            break;
                        case 2:
                            System.out.println("Choose which index you want to remove: ");
                            listPerson.listPerson();
                            //calls for method
                            pos = sc.nextInt();
                            listPerson.removePerson(pos);
                            //the variabel pos is the position u want to remove
                            //scanner takes the input from user
                            break;
                        case 3:
                            listPerson.findPerson();
                            //calls for search method
                            break;
                        case 4:
                            listPerson.listPerson();
                            //prints your contactbook
                            break;
                        case 5:
                            System.out.println("Choose which index you want to change: ");
                            listPerson.listPerson();
                            pos = sc.nextInt();
                            listPerson.changePersonInfo(pos);
                            //this works like the code in case 2
                            break;
                        case 6:
                            saveLists();
                            //calls for save method that saves your progress to lists
                            break;
                        case 7:
                            menuType = 0;
                            //this takes u back to the main menu
                            break;
                        case 8:
                            saveLists();
                            System.exit(0);
                            //before exit saves your progress
                            break;
                        default:
                            System.out.println("Error! Choose an option between 1-8");
                            //This triggers if u dont enter a number between 1-8
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
                            //this menu has the same functions as the person menu
                    }
                }
            } catch (InputMismatchException e){
                System.out.println("Error! Only numbers are valid as input!");
                sc.next();
                continue;
                //Catch input exception like if u enter a letter not a number
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
        //This method just calls for save method. Its a method here instead of repeating this code in the menu
    }
}
