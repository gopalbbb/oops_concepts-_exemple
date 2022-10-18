package abstraction;

public class Main {
    public static void main(String[] args) {
       TV tv =new LED();
       tv.getScreen();
       tv.getSize();
       tv.getColor();
       tv.getType();
        System.out.println("=====================");

      TV tv1=new LCD();
        tv1.getScreen();
        tv1.getSize();
        tv1.getColor();
        tv1.getType();

        System.out.println("**************************");
        TV tv2 =new DLP();
        tv2.getScreen();
        tv2.getSize();
        tv2.getColor();


    }
}
