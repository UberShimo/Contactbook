package user;

import list.Remove;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void start() {

        while (true) {
            System.out.println("============ CONTACT BOOK ============");
            System.out.println("\nWelcome to the contactbook. Make a choice in the menu: \n");
            System.out.print("1. Add a person\n2. Add an organisation or company\n3. Search in the contact book\n4. Remove from contact book\n" +
                    "5. Exit");

            switch (sc.nextInt()) {
                case 1:
                    //Kallar på metod
                    break;
                case 2:
                    //kallar på metod
                    break;
                case 3:
                    System.out.println("Make your choice in the menu: ");
                    System.out.println("1. Search for a person.\n2. Search for a organisation or a company.");
                    if (sc.nextInt() == 1){
                        System.out.println("Enter an name or a phone number:");
                        //kalla på sökmetod
                    } else if (sc.nextInt() == 2){
                        System.out.println("Enter an name or a phone number:");
                        //kalla på sökmetod
                    }
                    break;
                case 4:
                    //remove
                    break;
                case 5:
                    //save method?
                    System.exit(0);
                default:

                    break;
            }
        }
    }


}
