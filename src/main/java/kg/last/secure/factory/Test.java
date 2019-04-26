package kg.last.secure.factory;

public class Test {
    private static StoreInShop shop;

    static void congigurate(String storeType){
        if(storeType.equals("Ноутбук")){
            shop = new ComputerStore();
        } else if(storeType.equals("Книга")){
            shop = new BookStore();
        }
    }

    static void work(){
        shop.putInShop();
    }

    public static void main(String[] args) {
        congigurate("Ноутбук");
        shop.putInShop();
    }
}
