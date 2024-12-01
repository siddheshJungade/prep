

public class Inventory {
    private List<ItemShelf> itemShelfList;

    public Inventory() {
        itemShelfList = new ArrayList<>();
    }

    public void addItem(Item item, int quantity) {
        ItemShelf itemShelf = new ItemShelf(item, quantity);
        itemShelfList.add(itemShelf);
    }

    public void decrementItem(Item item) {
        for (ItemShelf itemShelf : itemShelfList) {
            if (itemShelf.getItem().getItemType() == item.getItemType()) {
                itemShelf.decrementQuantity();
            }
        }
    }

    public boolean isSoldOut(Item item) {
        for (ItemShelf itemShelf : itemShelfList) {
            if (itemShelf.getItem().getItemType() == item.getItemType()) {
                return itemShelf.isSoldOut();
            }
        }
        return true;
    }

    public int getItemPrice(Item item) {
        for (ItemShelf itemShelf : itemShelfList) {
            if (itemShelf.getItem().getItemType() == item.getItemType()) {
                return itemShelf.getItem().getPrice();
            }
        }
        return 0;
    }

    public boolean hasItem(Item item) {
        for (ItemShelf itemShelf : itemShelfList) {
            if (itemShelf.getItem().getItemType() == item.getItemType()) {
                return true;
            }
        }
        return false;
    }

    public void addItemQuantity(Item item, int quantity) {
        for (ItemShelf itemShelf : itemShelfList) {
            if (itemShelf.getItem().getItemType() == item.getItemType()) {
                itemShelf.setQuantity(itemShelf.getQuantity() + quantity);
            }
        }
    }
}