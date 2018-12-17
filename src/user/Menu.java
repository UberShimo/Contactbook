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
        //load method

        Load load = new Load();

        Load.load();
        while (true) {
            System.out.println("============ CONTACT BOOK ============");
            System.out.println("\nWelcome to the contactbook. Make a choice in the menu: \n");
            System.out.print("1. Add a person\n2. Add an organisation or company\n3. Search in the contact book\n4. Remove from contact book\n" +
                    "5. Exit");
            //printing the menu options
            switch (sc.nextInt()) {
                //using a scanner to select options in menu and then using the switch
                case 1:
                    c.createPerson();
                    //calls for the create person method
                    break;
                case 2:
                    c.createCompany();
                    //calls for the create company method
                    break;
                case 3:
                    System.out.println("Make your choice in the menu: ");
                    System.out.println("1. Search for a person.\n2. Search for a organisation or a company.");
                    if (sc.nextInt() == 1){
                        //if the value is 1 do this
                        System.out.println("Enter a name or a phone number:");
                        //kalla på sökmetod
                    } else if (sc.nextInt() == 2){
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
            }
        }
    }


}
