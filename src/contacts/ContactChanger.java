package contacts;

import java.text.DecimalFormat;
import java.util.Scanner;

//The class ContactChanger is used for change values of created Contact objects
public class ContactChanger {

    //Scanner for user input
    private static Scanner sc = new Scanner(System.in);

    //The method changePersonInfo is used for changing Person objects
    //The method is static so you don´t have to create an object of the Class to use it
    public static void changePersonInfo(Person person)
    {
        String menuOption;  //Stores menu options

        //Looping the menu until user enters 0 for exit
        do {

            System.out.println();
            System.out.println("What do you want to change?");
            System.out.println();
            System.out.println("1. First name");
            System.out.println("2. Last name");
            System.out.println("3. Email");
            System.out.println("4. Phone number");
            System.out.println("0. Exit");

            menuOption = sc.next();  //User input expected

            //Switch case menu for users choice
            //Methods for different changes to the object is called
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

    //The method changePersonInfo is used for changing Person objects
    //The method is static so you don´t have to create an object of the Class to use it
    public static void changeCompanyInfo(Company company)
    {
        String menuOption;  //Stores menu options

        //Looping the menu until user enters 0 for exit
        do {

            System.out.println();
            System.out.println("What do you want to change?");
            System.out.println();
            System.out.println("1. Company name");
            System.out.println("2. Email");
            System.out.println("3. Phone number");
            System.out.println("0. Exit");

            menuOption = sc.next();  //User input expected

            //Switch case menu for users choice
            //Methods for different changes to the object is called
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

    //Method for changing name on a contact
    private static void changeName(Contact contact) {

        String name;  //Stores contacts new name

        System.out.println();
        System.out.println(contact.getName());  //contact.getName is called to print the current name of a contact
        System.out.println("---------------");
        System.out.println("Enter new name:");

        name = sc.next();  //User input expected

        if(name != null && !name.equals("")) {

            contact.setName(name);  //Contact gets its new name

            System.out.println("Name changed");
            System.out.println();
        }
        else
        {
            System.out.println("Invalid name");
        }
    }

    //Method for changing last name on a person
    private static void changeLastName(Person person) {

        String lastName;  //Stores persons new last name

        System.out.println();
        System.out.println(person.getLastName());  //person.getLastName is called to print the current last name of a person
        System.out.println("---------------");
        System.out.println("Enter new last name:");

        lastName = sc.next();  //User input expected

        if(lastName != null && !lastName.equals("")) {

            person.setLastName(lastName);  //Person gets its new last name

            System.out.println("Last name changed");
            System.out.println();
        }
        else
        {
            System.out.println("Invalid name");
        }
    }

    //Method for changing email on a contact
    private static void changeEmail(Contact contact) {

        String email;  //Stores contacts new email

        System.out.println();
        System.out.println(contact.getEmail());  //contact.getEmail is called to print the current email of a contact
        System.out.println("---------------");
        System.out.println("Enter new email:");

        email = sc.next();  //User input expected

        if(email != null && email.contains("@")) {

            contact.setEmail(email);  //Contact gets its new email

            System.out.println("Email changed");
            System.out.println();
        }
        else
        {
            System.out.println("Invalid email");
        }
    }

    //Method for changing phone number on a contact
    private static void changePhoneNumber(Contact contact) {

        String inputNumber;  //Stores new phone number input from the user
        String phoneNumber;  //Stores new phoneNumber after being checked

        System.out.println();
        System.out.println(contact.getPhoneNumber());  //contact.getPhoneNumber is called to print the current email of a contact
        System.out.println("---------------");

        //Loop to give the user multiple tries to write a valid number
        do {

            System.out.println("Enter new phone number:");

            inputNumber = sc.next();  //User input expected

            phoneNumber = checkPhoneNumber(inputNumber);  //New phone number getting checked by method checkPhoneNumber

            if(phoneNumber != null && !phoneNumber.equals(""))  //If new phone number is valid
            {
                contact.setPhoneNumber(phoneNumber);  //Contact gets its new email
                break;  //Breaks the loop
            }
            else
            {
                System.out.println("Try again!");
            }

        }while(true);

        System.out.println("Phone number changed");
        System.out.println();

    }

    //Method for checking phone number
    private static String checkPhoneNumber(String inputNumber) {

        Integer phoneNumber = null;  //Stores phone number during check

        try {
            phoneNumber = Integer.parseInt(inputNumber);  //inputNumber getting parsed and put in phoneNumber
        }
        catch(NumberFormatException nfe)  //Exception messages
        {
            if(inputNumber.matches("[0-9]+")) {  //If inputNumber only contains numbers

                //Counting digits in the inputNumber
                int count = inputNumber.length() - inputNumber.replace(inputNumber, "").length();

                if (count > 10) {  //If the inputNumber contains more than 10 digits its invalid
                    System.out.println("Number too long, 10 digits is max!");
                } //Else if the inputNumber is greater than the max value of an Integer
                else if (Long.parseLong(inputNumber) > Integer.MAX_VALUE) {
                    System.out.println("2147483647 is the highest number available!");
                }
            }
            else {
                System.out.println("Phone-number can only contain numbers!");
            }
        }

        if(phoneNumber != null) {

            DecimalFormat df = new DecimalFormat("0000000000");  //Setting the wanted format of the phoneNumber
            return df.format(phoneNumber);  //Giving phoneNumber the wanted format and returning it
        }

        return null;
    }
}
