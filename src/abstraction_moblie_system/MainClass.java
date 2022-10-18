package abstraction_moblie_system;

import java.sql.SQLOutput;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Press Green Button");
    Mobile mobile= new Calling_Key();
        mobile.greenButton();

        System.out.println("Press Red Button for Switch Off");
        Mobile mobile1=new Sewtch_Off();
        mobile1.redButton();

        System.out.println("Press Red Button for Switch On");
        Mobile mobile2=new Swetch_On();
        mobile2.redButton();


    }
}
