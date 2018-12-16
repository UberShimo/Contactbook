package contacts;

import java.io.Serializable;
import java.util.Scanner;

public class CreateContact implements Serializable {

    private static Scanner sc = new Scanner(System.in);

    public static void createPerson()
    {
        Person person = null;
        String firstName;
        String lastName;
        String email;
        String inputNumber;
        Integer phoneNumber = null;

        System.out.println();
        System.out.println("Enter personal information!");
        System.out.println("You must fill in first- and last name, plus phone number or email or both");
        System.out.println();
        System.out.println("First name:");
        firstName = sc.next();
        System.out.println("Last name:");
        lastName = sc.next();
        sc.nextLine();
        System.out.println("Email, containing @:");
        email = sc.nextLine();
        System.out.println("Phone number, 10 digits:");
        inputNumber = sc.nextLine();
        if(!inputNumber.equals(""))
            phoneNumber = numberFormat(inputNumber);


        try {
            if (phoneNumber != null) {
                if (!email.equals("")) {
                    person = new Person(firstName, lastName, phoneNumber, email);
                } else {
                    person = new Person(firstName, lastName, phoneNumber);
                }
            } else if (!email.equals("")) {
                person = new Person(firstName, lastName, email);
            }
            else {
                System.out.println("Missing info!");
            }
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }

        System.out.println(person);
    }

    private static Integer numberFormat(String inputNumber) {

        Integer phoneNumber;

        do {
            try {
                phoneNumber = Integer.parseInt(inputNumber);
                break;
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

            System.out.println("Try again:");
            inputNumber = sc.next();
            System.out.println();

        }while(true);

        return phoneNumber;
    }

}
