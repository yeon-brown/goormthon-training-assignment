package shopping;

import java.util.HashMap;

public class Cart extends HashMap<Long, Item> {
    Long sequence=0L;

    public Cart() {}

    public void showItems(){
        HashMap<Item, Integer> currentItems = new HashMap<>();
        for (Long key : super.keySet()) {
            Item item = super.get(key);
            if (currentItems.containsKey(item)){
                int count = currentItems.get(item);
                currentItems.replace(item, ++count);
            }else {
                currentItems.put(item, 1);
            }
        }
        for (Item item1 : currentItems.keySet()) {
            System.out.println("장바구니에 담긴 상품들");
            System.out.println(item1.getItemName() + " " + currentItems.get(item1)+"개");
        }
    }
    public void addProduct(Item item, int count){
        for (int i = 0; i < count; i++) {
            super.put(sequence++, item);
        }
    }
    public void removeProduct(Item item, int count){
        for (int i = 0; i < count; i++) {
            for (Long key : super.keySet()){
                if(super.get(key)==item){
                    super.remove(key,item);
                }
            }
        }
    }
}
