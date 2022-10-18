package encapsulation;

public class Encapsulation {
    private int id;
   private String Name;

    private String emailId;

    public Encapsulation() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
        System.out.println("FirstName");
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    void getinfo(){
        System.out.println("Encapsulation");
    }
}
