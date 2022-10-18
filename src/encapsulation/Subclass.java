package encapsulation;

import java.sql.SQLOutput;

public class Subclass {
    public static void main(String[] args) {
        Encapsulation S1=new Encapsulation();
        S1.setName("Lochan BHatta");
        S1.setEmailId("Loacha@123gmail.com");
        S1.getinfo();


        Encapsulation S2= new Encapsulation();
        S2.setName("Sagar");
        S2.setEmailId("Sagar123@gmail.com");




        System.out.println(S1.getEmailId());
        System.out.println(S1.getName());
        System.out.println(S2.getName());
        System.out.println(S2.getEmailId());










    }


}
