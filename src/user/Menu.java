package user;

import contacts.CreateContact;
import list.Load;
import list.Remove;
import list.Save;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    //initialized new scanner
    CreateContact c;

    public void start() {

        Load.load();
        int menuType = 0;

        while (true) {
            if (menuType == 0) {
                System.out.println("============ CONTACT BOOK ============");
                System.out.println("\nWelcome to the contact book. Make a choice in the menu: \n");
                System.out.println("1. Person menu\n2. Company menu\n");
                //printing the menu options
                switch (sc.nextInt()) {
                    //using a scanner to select options in menu and then using the switch
                    case 1:
                        menuType = 1;
                        break;
                    case 2:
                        menuType = 2;
                        break;
                    default:
                        System.out.println("Error! Make your choice between 1 or 2!");
                        break;
                }
            } else if ( menuType == 1 ){
                System.out.println("============ PERSON MENU ============");
                System.out.println("\nMake your choice in the menu: ");
                System.out.println("\n1. Create contact\n2. Remove contact\n3. Search contact\n4. View contact book\n" +
                        "5. Exit");
                switch (sc.nextInt()){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
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
                        "5. Exit");
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
                        //save
                        System.out.println("Saved changes");
                        System.exit(0);
                        break;
                    default:
                        break;
                }

            }




                    /*case 3:
                        System.out.println("Make your choice in the menu: ");
                        System.out.println("1. Search for a person.\n2. Search for a organisation or a company.");
                        if (sc.nextInt() == 1) {
                            //if the value is 1 do this
                            System.out.println("Enter a name or a phone number:");
                            //kalla på sökmetod
                        } else if (sc.nextInt() == 2) {
                            //if the value is 2 do this
                            System.out.println("Enter a name or a phone number:");
                            //kalla på sökmetod
                        }
                        break;
                    case 4:
                        //remove
                        break;
                    case 5:
                        //save
                        System.out.println("Saved changes");
                        System.exit(0);
                    default:

                        break;
                }*/


        }
    }
}
