package contacts;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContactChanger {

    static Scanner sc = new Scanner(System.in);

    public static void changePersonInfo(Person person)
    {
        String menuOption;

        do {

            System.out.println();
            System.out.println("What do you want to change?");
            System.out.println();
            System.out.println("1. First name");
            System.out.println("2. Last name");
            System.out.println("3. Email");
            System.out.println("4. Phone number");
            System.out.println("0. Exit");

            menuOption = sc.next();

            switch (menuOption) {
                case "1":
                    changeName(person);
                    break;
                case "2":
                    changeLastName(person);
                    break;
                case "3":
                    changeEmail(person);
                    break;
                case "4":
                    changePhoneNumber(person);
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Choose an option from the menu!");
                    System.out.println();
                    break;
            }
        }while(!menuOption.equals("0"));

        System.out.println();
    }

    public static void changeCompanyInfo(Company company)
    {
        String menuOption;

        do {

            System.out.println();
            System.out.println("What do you want to change?");
            System.out.println();
            System.out.println("1. Company name");
            System.out.println("2. Email");
            System.out.println("3. Phone number");
            System.out.println("0. Exit");

            menuOption = sc.next();

            switch (menuOption) {
                case "1":
                    changeName(company);
                    break;
                case "2":
                    changeEmail(company);
                    break;
                case "3":
                    changePhoneNumber(company);
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Choose an option from the menu!");
                    System.out.println();
                    break;
            }
        }while(!menuOption.equals("0"));

        System.out.println();
    }

    private static void changeName(Contact contact) {

        String name;

        System.out.println();
        System.out.println(contact.getName());
        System.out.println("---------------");
        System.out.println("Enter new name:");

        name = sc.next();

        if(name != null && !name.equals("")) {

            contact.setName(name);

            System.out.println("Name changed");
            System.out.println();
        }
        else
        {
            System.out.println("Invalid name");
        }
    }

    private static void changeLastName(Person person) {

        String lastName;

        System.out.println();
        System.out.println(person.getLastName());
        System.out.println("---------------");
        System.out.println("Enter new last name:");

        lastName = sc.next();

        if(lastName != null && !lastName.equals("")) {

            person.setName(lastName);

            System.out.println("Last name changed");
            System.out.println();
        }
        else
        {
            System.out.println("Invalid name");
        }
    }

    private static void changeEmail(Contact contact) {

        String email;

        System.out.println();
        System.out.println(contact.getEmail());
        System.out.println("---------------");
        System.out.println("Enter new email:");

        email = sc.next();

        if(email != null && email.contains("@")) {

            contact.setEmail(email);

            System.out.println("Email changed");
            System.out.println();
        }
        else
        {
            System.out.println("Invalid email");
        }
    }

    private static void changePhoneNumber(Contact contact) {

        String inputNumber;
        String phoneNumber;

        System.out.println();
        System.out.println(contact.getPhoneNumber());
        System.out.println("---------------");

        do {

            System.out.println("Enter new phone number:");

            inputNumber = sc.next();

            phoneNumber = checkPhoneNumber(inputNumber);

            if(phoneNumber != null && !phoneNumber.equals(""))
            {
                contact.setPhoneNumber(phoneNumber);
                break;
            }
            else
            {
                System.out.println("Try again!");
            }

        }while(true);

        System.out.println("Phone number changed");
        System.out.println();

    }

    private static String checkPhoneNumber(String inputNumber) {

        Integer phoneNumber = null;

        try {
            phoneNumber = Integer.parseInt(inputNumber);
        }
        catch(NumberFormatException nfe)
        {
            if(inputNumber.matches("[0-9]+")) {

                int count = inputNumber.length() - inputNumber.replace(inputNumber, "").length();

                if (count > 10) {
                    System.out.println("Number too long, 10 digits is max!");
                }
                else if (Long.parseLong(inputNumber) > Integer.MAX_VALUE) {
                    System.out.println("2147483647 is the highest number available!");
                }
            }
            else {
                System.out.println("Phone-number can only contain numbers!");
            }
        }

        if(phoneNumber != null) {

            DecimalFormat df = new DecimalFormat("0000000000");
            return df.format(phoneNumber);
        }

        return null;
    }
}
