package kg.last.secure.factory;

public class Laptop implements Item {
    @Override
    public void sell() {
        System.out.println("Laptop sell");
    }

    @Override
    public void buy() {
        System.out.println("Laptop buy");
    }

    @Override
    public void unpack() {
        System.out.println("Laptop unpack");
    }

    @Override
    public void log() {
        System.out.println("Laptop logged");
    }
}
