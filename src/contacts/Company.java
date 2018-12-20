package contacts;

import java.io.Serializable;
import java.text.DecimalFormat;

//Class for creating Company objects
//The class implements interface Contact for creating polymorphism
//The class implements Serializable to be able to get saved to file
public class Company implements Contact, Serializable {

    private String companyName;
    private String email;
    private String phoneNumber;

    //Private constructor for checking company name
    private Company(String companyName) {

        if(companyName == null)
        {
            throw new IllegalArgumentException("Invalid comapany name"); //Throwing exception if companyName is invalid
        }
        else
        {
            this.companyName = companyName;  //companyName is saved to the object
        }
    }

    //Constructor for creating Company objects with just phone number
    public Company(String companyName, Integer phoneNumber)
    {
        this(companyName);  //Constructor calling the first constructor for checking name

        this.phoneNumber = getNumberFormat(phoneNumber);  //phoneNumber is saved to the object after going through
                                                          //the method getNumberFormat
    }

    //Constructor for creating Company objects with just email
    public Company(String companyName, String email)
    {
        this(companyName);  //Constructor calling the first constructor for checking name

        if(email.equals("") || !email.contains("@")) {

            throw new IllegalArgumentException("Invalid email");  //Throwing exception if email is invalid
        }
        else
        {
            this.email = email;  //email is saved to the object
        }
    }

    //Constructor for creating Company objects with phone number and email
    public Company(String companyName, Integer phoneNumber, String email)
    {
        this(companyName, email); //Constructor calling the above constructor for checking email

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
        return companyName;
    }

    public void setName(String companyName) {
        this.companyName = companyName;
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

        return String.format("Company-name: %s.  Email: %s.  Phone-number: %s.  ",
                companyName, email, phoneNumber);
    }
}
