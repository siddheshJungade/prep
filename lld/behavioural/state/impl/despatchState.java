

public class DispenseItemStateImpl implements State {
    public DispenseItemStateImpl() {
        System.out.println("Vending Machine is in DispenseItem state");
    }
    public DispenseItemStateImpl(VendingMachine vendingMachine) {
        System.out.println("Vending Machine is in DispenseItem state");
    }
    @Override
    public void clickInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Invalid action");
    }
    @Override
    public void clickSelectProductButton() throws Exception {
        throw new Exception("Invalid action");
    }
    @Override
    public void insertCoin(VendingMachine vendingMachine,Coin coin) throws Exception {
        throw new Exception("Invalid action");
    }
    @Override
    public void chooseProduct(VendingMachine vendingMachine,Item item) throws Exception {
        throw new Exception("Invalid action");
    }
    @Override
    public int getChange(price,totalMoneyTaken) throws Exception {
        return totalMoneyTaken - price;
    }
    @Override
    public Item dispense(VendingMachine vendingMachine) throws Exception {
        price = vendingMachine.getItem().getPrice();
        if (price > vendingMachine.getCoinList().stream().mapToInt(Coin::getValue).sum()) {
            refundMoney()
        } else {
            System.out.println("Dispensing item");
            machine.setVendingMachineState(new IdleStateImpl());
            const change = getChange(price,vendingMachine.getCoinList().stream().mapToInt(Coin::getValue).sum());
            return machine.getItem();
        }
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