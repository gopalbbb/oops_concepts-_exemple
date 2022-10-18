package abstraction;

public class LCD extends TV {
    @Override
    void getScreen() {
        System.out.println("Mid range flat");
    }

    @Override
    void getSize() {
        System.out.println("70*60 inch");

    }

    @Override
    void getColor() {
        System.out.println("black");

    }

    @Override
    void getType() {
        System.out.println("LCD");

    }
    void getPrice(){
        System.out.println("65K");
    }
}
