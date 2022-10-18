package abstraction;

abstract class TV {
    TV(){
        System.out.println("tv is created");
    }
    abstract void getScreen();
    abstract void getSize();
   abstract void getColor();
    abstract void getType();
    abstract void getPrice();
}
