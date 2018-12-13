package user;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void start() {

        while (true) {
            System.out.println("============ CONTACTBOOK ============");
            System.out.println("\nWelcome to the contactbook. Make a choice in the menu: \n");
            System.out.print("1. Add a person\n2. Add an organisation or company\n3. Exit\n");

            switch (sc.nextInt()) {
                case 1:
                    //Kallar på metod
                    break;
                case 2:
                    //kallar på metod
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:

                    break;
            }
        }
    }
}
