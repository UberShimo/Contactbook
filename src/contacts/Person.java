package contacts;

import java.text.DecimalFormat;

public class Person{

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public Person(String firstName, String lastName, Integer phoneNumber)
    {
        if(firstName == null)
        {
            throw new IllegalArgumentException("Invalid first-name");
        }
        else if(lastName == null)
        {
            throw new IllegalArgumentException("Invalid last-name");
        }
        else if(phoneNumber == null) {

            throw new IllegalArgumentException("Invalid phone-number");
        }
        else {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = getNumberFormat(phoneNumber);
        }
    }

    public Person(String firstName, String lastName, String email)
    {
        if(firstName == null)
        {
            throw new IllegalArgumentException("Invalid first-name");
        }
        else if(lastName == null)
        {
            throw new IllegalArgumentException("Invalid last-name");
        }
        else if(email == null || !email.contains("@")) {

            throw new IllegalArgumentException("Invalid email");
        }
        else
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }
    }

    public Person(String firstName, String lastName, Integer phoneNumber, String email)
    {
        this(firstName, lastName, email);

        if(phoneNumber == null)
        {
            throw new IllegalArgumentException("Invalid phone-number");
        }
        else
        {
            this.phoneNumber = getNumberFormat(phoneNumber);
        }
    }

    public String getNumberFormat(Integer phoneNumber)
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
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

        return String.format("First-name: %s.  Last-name: %s.  Phone-number: %s.  Email: %s.",
                firstName, lastName, phoneNumber, email);
    }
}


