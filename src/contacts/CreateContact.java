package contacts;

import java.util.Scanner;

//The class CreateContact is used for creating Contact objects
public class CreateContact{

    //Scanner for user input
    private static Scanner sc = new Scanner(System.in);

    //The method createPerson is used for creating Person objects
    //The method is static so you don´t have to create an object of the Class to use it
    public static Person createPerson()
    {
        Person person = null;  //Stores the person that is created
        String firstName;
        String lastName;
        String email;
        String inputNumber;  //Stores input from user for phone number
        Integer phoneNumber = null;  //Stores the final phone number

        System.out.println();
        System.out.println("Enter personal information!");
        System.out.println("You must fill in first- and last name and at least either email or phone number");
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
        if(!inputNumber.equals(""))  //If inputNumber is not an empty String
            phoneNumber = parseNumber(inputNumber);  //Method parseNumber is called to check and parse inputNumber

        //Try & catch for creating object
        try {
            if (phoneNumber != null) {  //If there was input for phone number
                if (!email.equals("")) {  //If there was input for email
                    person = new Person(firstName, lastName, phoneNumber, email);  //Person object created with number and email
                } else {
                    person = new Person(firstName, lastName, phoneNumber);  //Person object created with just phone number
                }
            } else if (!email.equals("")) {  //If there was input for email
                person = new Person(firstName, lastName, email);  //Person object created with just email
            }
            else {
                System.out.println("Missing info!");
            }
        }
        catch(IllegalArgumentException iae)  //Exception handling if Person object could´nt be created
        {
            System.out.println(iae.getMessage());
        }

        System.out.println(person);  //Print person (calling toString)
        return person;  //Returning created object
    }

    //The method createCompany is used for creating Company objects
    //The method is static so you don´t have to create an object of the Class to use it
    public static Company createCompany()
    {
        Company company = null;  //Stores the company that is created
        String companyName;
        String email;
        String inputNumber;  //Stores input from user for phone number
        Integer phoneNumber = null;  //Stores the final phone number

        System.out.println();
        System.out.println("Enter company information!");
        System.out.println("You must fill in company name and at least either email or phone number");
        System.out.println("Press enter to skip email or phone number");
        System.out.println();
        System.out.println("Company name:");
        companyName = sc.next();
        sc.nextLine();
        System.out.println("Email, containing @:");
        email = sc.nextLine();
        System.out.println("Phone number, 10 digits:");
        inputNumber = sc.nextLine();
        if(!inputNumber.equals(""))  //If inputNumber is not an empty String
            phoneNumber = parseNumber(inputNumber);  //Method parseNumber is called to check and parse inputNumber

        //Try & catch for creating object
        try {
            if (phoneNumber != null) {  //If there was input for phone number
                if (!email.equals("")) {  //If there was input for email
                    company = new Company(companyName, phoneNumber, email);  //Company object created with number and email
                } else {
                    company = new Company(companyName, phoneNumber);  //Company object created with just phone number
                }
            } else if (!email.equals("")) {  //If there was input for email
                company = new Company(companyName, email);  //Company object created with just email
            }
            else {
                System.out.println("Missing info!");
            }
        }
        catch(IllegalArgumentException iae)  //Exception handling if Company object could´nt be created
        {
            System.out.println(iae.getMessage());
        }

        System.out.println(company);  //Print company (calling toString)
        return company;  //Returning created object
    }

    //Method for checking and parsing phone number
    private static Integer parseNumber(String inputNumber) {

        Integer phoneNumber;  //Stores phone number during check

        //Loop to give the user multiple tries to write a valid number
        do {
            //Try & catch for parsing inputNumber
            try {
                phoneNumber = Integer.parseInt(inputNumber);  //input number getting parsed and is given to phoneNumber
                break;  //Breaks the loop
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

            System.out.println("Try again:");
            inputNumber = sc.next();  //New try to write a valid number
            System.out.println();

        }while(true);

        return phoneNumber;  //Phone number is returned
    }
}
