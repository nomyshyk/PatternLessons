package kg.last.secure.factory2;

import kg.last.secure.factory.Book;
import kg.last.secure.factory.Item;
import kg.last.secure.factory.Laptop;

public class ItemFactory {
    public Item getItem(String itemType){
        if(itemType.equals("Ноутбук")){
             return new Laptop();
        } else if(itemType.equals("Книга")){
            return new Book();
        }
        return null;
    }
}
