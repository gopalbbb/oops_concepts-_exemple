package abstraction;

public class LED extends TV{
    @Override
    void getScreen() {
        System.out.println("lower mid range ");

    }

    @Override
    void getSize() {
        System.out.println("50*50 inch");

    }

    @Override
    void getColor() {
        System.out.println("Black");

    }

    @Override
    void getType() {
        System.out.println("LED");

    }

    @Override
    void getPrice() {

    }
}
