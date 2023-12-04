package shopping;

import java.util.Objects;

public class Item {
    private Long itemId;
    private String itemName;
    private int itemPrice;

    public Item(String itemName, int itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() { return itemName;}

    public int getItemPrice() {
        return itemPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return itemPrice == item.itemPrice && Objects.equals(itemId, item.itemId) && Objects.equals(itemName, item.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, itemPrice);
    }
}
