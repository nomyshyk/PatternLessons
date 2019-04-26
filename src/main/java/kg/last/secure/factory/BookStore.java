package kg.last.secure.factory;

public class BookStore extends StoreInShop {

    @Override
    public Item createItem() {
        return new Book();
    }

}
