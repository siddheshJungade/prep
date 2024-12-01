

public class SelectProductStateImpl extends State {
    public SelectProductStateImpl() {
        System.out.println("Vending Machine is in SelectProduct state");
    }
    public SelectProductStateImpl(VendingMachine vendingMachine) {
        System.out.println("Vending Machine is in SelectProduct state");
    }
    @Override
    public void clickInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Invalid action");
    }
    @Override
    public void clickSelectProductButton() throws Exception {
        return;
    }
    @Override
    public void insertCoin(VendingMachine vendingMachine,Coin coin) throws Exception {
        throw new Exception("Invalid action");
    }
    @Override
    public void chooseProduct(VendingMachine vendingMachine,Item item) throws Exception {
        System.out.println("Product selected");
        vendingMachine.setItem(item);
        vendingMachine.setVendingMachineState(new DispenseItemStateImpl());
    }
    @Override
    public int getChange() throws Exception {
        throw new Exception("Invalid action");
    }
    @Override
    public Item dispense() throws Exception {
        throw new Exception("Invalid action");
    }
    @Override
    public List<Coin> refundMoney() throws Exception {
        System.out.println("Refunding money");
        machine.setVendingMachineState(new IdleStateImpl());
        return machine.getCoinList();
    }
    @Override
    public void updateInventory() throws Exception {
        throw new Exception("Invalid action");
    }
}