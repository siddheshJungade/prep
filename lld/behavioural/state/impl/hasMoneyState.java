

public class HasMoneyStateImpl extends State {

    public HasMoneyStateImpl() {
        System.out.println("Vending Machine is in HasMoney state");
    }
    public HasMoneyStateImpl(VendingMachine vendingMachine) {
        System.out.println("Vending Machine is in HasMoney state");
    }
    @Override
    public void clickInsertCoinButton() throws Exception {
        return;
    }
    @Override
    public void clickSelectProductButton(VendingMachine vendingMachine) throws Exception {
        this.vendingMachine.setVendingMachineState(new SelectProductStateImpl());
    }
    @Override
    public void insertCoin(VendingMachine vendingMachine,Coin coin) throws Exception {
        System.out.println("Coin inserted");
        vendingMachine.getCoinList().add(coin);
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
        System.out.println("Refunding money");
        machine.setVendingMachineState(new IdleStateImpl());
        return machine.getCoinList();
    }
    @Override
    public void updateInventory() throws Exception {
        throw new Exception("Invalid action");
    }

} 