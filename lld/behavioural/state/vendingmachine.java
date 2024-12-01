
public class VendingMachine {
    private State vendingMachineState;
    private List<Coin> coinList;
    private Inventory inventory;   

    public VendingMachine() {
        vendingMachineState = new IdleStateImpl();
        coinList = new ArrayList<>();
        inventory = new Inventory(10);
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    } 
}