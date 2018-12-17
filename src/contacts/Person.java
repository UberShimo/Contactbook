package contacts;

import java.io.Serializable;
import java.text.DecimalFormat;

//The class Person is for creating Person objects
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
            throw new IllegalArgumentException("Invalid first-name");
        }
        else if(lastName == null)
        {
            throw new IllegalArgumentException("Invalid last-name");
        }
        else
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    //Constructor for creating objects
    public Person(String firstName, String lastName, Integer phoneNumber)
    {
        this(firstName, lastName);

        this.phoneNumber = getNumberFormat(phoneNumber);
    }

    public Person(String firstName, String lastName, String email)
    {
        this(firstName, lastName);

        if(email == null || !email.contains("@")) {

            throw new IllegalArgumentException("Invalid email");
        }
        else
        {
            this.email = email;
        }
    }

    public Person(String firstName, String lastName, Integer phoneNumber, String email)
    {
        this(firstName, lastName, email);

        this.phoneNumber = getNumberFormat(phoneNumber);
    }



    private String getNumberFormat(Integer phoneNumber)
    {
        if(phoneNumber == null)
        {
            throw new NullPointerException("Phone-number error!");
        }
        else {
            DecimalFormat df = new DecimalFormat("0000000000");
            return df.format(phoneNumber);
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


