package contacts;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Company implements Serializable {

    private String companyName;
    private String phoneNumber;
    private String email;

    private Company(String companyName) {

        if(companyName == null)
        {
            throw new IllegalArgumentException("Invalid comapany name");
        }
        else
        {
            this.companyName = companyName;
        }
    }

    public Company(String companyName, Integer phoneNumber)
    {
        this(companyName);

        this.phoneNumber = getNumberFormat(phoneNumber);
    }

    public Company(String companyName, String email)
    {
        this(companyName);

        if(email.equals("") || !email.contains("@")) {

            throw new IllegalArgumentException("Invalid email");
        }
        else
        {
            this.email = email;
        }
    }

    public Company(String companyName, Integer phoneNumber, String email)
    {
        this(companyName, email);

        this.phoneNumber = getNumberFormat(phoneNumber);
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
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

        return String.format("Company-name: %s.  Phone-number: %s.  Email: %s.",
                companyName, phoneNumber, email);
    }
}
