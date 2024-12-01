

public class IdleStateImpl implements State {

    public IdleStateImpl() {
        System.out.println("Vending Machine is in Idle state");
    }
    public IdleStateImpl(VendingMachine vendingMachine) {
        System.out.println("Vending Machine is in Idle state");
        machine.setCoinList(new ArrayList<>());
    }
    @Override
    public void clickInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new HasMoneyStateImpl());
    }
    @Override
    public void clickSelectProductButton() throws Exception {
        throw new Exception("Invalid action");
    }
    @Override
    public void insertCoin() throws Exception {
        throw new Exception("Invalid action");
    }
    @Override
    public void chooseProduct() throws Exception {
        throw new Exception("Invalid action");
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
        throw new Exception("Invalid action");
    }
    @Override
    public void updateInventory() throws Exception {
        throw new Exception("Invalid action");
    }
}