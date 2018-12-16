package contacts;

import java.util.Scanner;

public class CreateContact{

    private static Scanner sc = new Scanner(System.in);

    public void createPerson()
    {
        Person person = null;
        String firstName;
        String lastName;
        String email;
        String inputNumber;
        Integer phoneNumber = null;

        System.out.println();
        System.out.println("Enter personal information!");
        System.out.println("You must fill in first- and last name, plus email or phone number or both");
        System.out.println("Press enter to skip email or phone number");
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

    public void createCompany()
    {
        Company company = null;
        String companyName;
        String email;
        String inputNumber;
        Integer phoneNumber = null;

        System.out.println();
        System.out.println("Enter company information!");
        System.out.println("You must fill in company name, plus email or phone number or both");
        System.out.println("Press enter to skip email or phone number");
        System.out.println();
        System.out.println("Company name:");
        companyName = sc.next();
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
                    company = new Company(companyName, phoneNumber, email);
                } else {
                    company = new Company(companyName, phoneNumber);
                }
            } else if (!email.equals("")) {
                company = new Company(companyName, email);
            }
            else {
                System.out.println("Missing info!");
            }
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }

        System.out.println(company);
    }

    private Integer numberFormat(String inputNumber) {

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
