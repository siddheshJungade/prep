
public enum ItemType {
    COKE,
    PEPSI,
    SODA
}

public class Item {
    ItemType itemType;
    int price;

    public Item(ItemType itemType, int price) {
        this.itemType = itemType;
        this.price = price;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public int getPrice() {
        return price;
    }
}


public class ItemShelf {
    private Item item;
    private int quantity;

    public ItemShelf(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void decrementQuantity() {
        this.quantity--;
    }

    public boolean isSoldOut() {
        return this.quantity == 0;
    }
}