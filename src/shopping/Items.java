package shopping;

import java.util.HashSet;

public class Items extends HashSet<Item> {
    Long sequence = 0L;

    public Items() {}

    @Override
    public boolean add(Item item) {
        if (!super.contains(item)){
            item.setItemId(sequence++);
            return super.add(item);
        }else return false;
    }

}
