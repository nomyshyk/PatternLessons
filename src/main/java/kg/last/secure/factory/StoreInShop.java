package kg.last.secure.factory;

public abstract class StoreInShop {
    public void putInShop(){
        Item item = createItem();
        item.unpack();
        item.sell();
        item.log();
    }

    public abstract Item createItem();
}
