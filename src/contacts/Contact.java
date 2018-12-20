package contacts;

//Interface Contact is used for creating polymorphism with Company and Person objects
public interface Contact {

    String getName();

    void setName(String firstName);

    String getPhoneNumber();

    void setPhoneNumber(String phoneNumber);

    String getEmail();

    void setEmail(String email);
}
