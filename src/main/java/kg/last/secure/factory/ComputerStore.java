package kg.last.secure.factory;

public class ComputerStore extends StoreInShop{
    @Override
    public Item createItem() {
        return new Laptop();
    }
}
