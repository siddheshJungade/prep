// design vending machine using state pattern
public interface State {
    public void clickInsertCoinButton() throws Exception;
    public void clickSelectProductButton() throws Exception;
    public void insertCoin() throws Exception;
    public void chooseProduct() throws Exception;
    public int getChange() throws Exception;
    public Item dispense() throws Exception;
    public List<Coin> refundMoney() throws Exception;
    public void updateInventory() throws Exception; 

}