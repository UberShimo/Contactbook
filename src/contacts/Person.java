package contacts;

import java.io.Serializable;
import java.text.DecimalFormat;

//The class Person is for creating Person objects
//The class implements interface Contact for creating polymorphism
//The class implements Serializable to be able to get saved to file
public class Person implements Contact, Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    //Private constructor for checking first and last name
    private Person(String firstName, String lastName)
    {
        if(firstName == null)
        {
            throw new IllegalArgumentException("Invalid first-name");  //Throwing exception if firstName is invalid
        }
        else if(lastName == null)
        {
            throw new IllegalArgumentException("Invalid last-name");  //Throwing exception if lastName is invalid
        }
        else
        {
            this.firstName = firstName;  //firstName is saved to the object
            this.lastName = lastName;  //lastName is saved to the object
        }
    }

    //Constructor for creating Person objects with just phoneNumber
    public Person(String firstName, String lastName, Integer phoneNumber)
    {
        this(firstName, lastName);  //Constructor calling the first constructor for checking names

        this.phoneNumber = getNumberFormat(phoneNumber);  //phoneNumber is saved to the object after going through
                                                          //the method getNumberFormat
    }

    //Constructor for creating Person objects with just email
    public Person(String firstName, String lastName, String email)
    {
        this(firstName, lastName);  //Constructor calling the first constructor for checking names

        if(email == null || !email.contains("@")) {

            throw new IllegalArgumentException("Invalid email");  //Throwing exception if email is invalid
        }
        else
        {
            this.email = email;  //email is saved to the object
        }
    }

    //Constructor for creating Person objects with phone number and email
    public Person(String firstName, String lastName, Integer phoneNumber, String email)
    {
        this(firstName, lastName, email);  //Constructor calling the above constructor for checking email

        this.phoneNumber = getNumberFormat(phoneNumber);  //phoneNumber is saved to the object after going through
                                                          //the method getNumberFormat
    }

    //The method getNumberFormat is for turning phoneNumber to a String and give it the right format
    private String getNumberFormat(Integer phoneNumber)
    {
        if(phoneNumber == null)
        {
            throw new NullPointerException("Phone-number error!");  //Throwing exception if email is invalid
        }
        else {
            DecimalFormat df = new DecimalFormat("0000000000");  //Setting the wanted format of the phoneNumber
            return df.format(phoneNumber);  //Giving phoneNumber the wanted format and returning it
        }
    }

    public String getName() {
        return firstName;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {

        return String.format("First-name: %s.  Last-name: %s.  Email: %s.  Phone-number: %s.  ",
                firstName, lastName, email, phoneNumber);
    }
}


