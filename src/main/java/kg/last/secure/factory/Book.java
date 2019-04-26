package kg.last.secure.factory;

public class Book implements Item{
    @Override
    public void sell() {
        System.out.println("Book sell");
    }

    @Override
    public void buy() {
        System.out.println("Book buy");
    }

    @Override
    public void unpack() {
        System.out.println("Book unpack");
    }

    @Override
    public void log() {
        System.out.println("Book logged");
    }
}
