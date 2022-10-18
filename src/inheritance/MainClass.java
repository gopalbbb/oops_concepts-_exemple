package inheritance;

public class MainClass {
    public static void main(String[] args) {


        ParentsClass P1= new ParentsClass();
        P1.lastName();
        P1.getAddress();
        System.out.println("=========================================");



        ChildClass Ch1=new ChildClass();
        Ch1.getChild();
        Ch1.firstName="Ram";
        Ch1.lastName();
        Ch1.getAddress();
        System.out.println(Ch1.firstName);

        System.out.println("=========================================");





        Grandson G1= new Grandson();
        G1.firstName="hari";
        G1.getSalary();
        G1.lastName();
        G1.getAddress();
        System.out.println(G1.firstName);



    }
}
