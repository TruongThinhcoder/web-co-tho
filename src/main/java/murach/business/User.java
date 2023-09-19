package murach.business;
import java.io.Serializable;
public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String hear;
    private String receive;
    private String contact;
    public User() {
        firstName = "";
        lastName = "";
        email = "";
        hear = " ";
        receive = " ";
        contact = " ";
    }
    public User(String firstName, String lastName, String email, String hear, String receive, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hear = hear;
        this.receive = receive;
        this.contact =  contact;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getHear() {return hear;}
    public void setHear(String hear){ this.hear = hear; }
    public String getReceive(){ return receive; }
    public void setReceive(String receive) { this.receive = receive; }
    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

}