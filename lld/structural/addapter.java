public interface WeightMachine {
    public double getWeightInPound();
}


public class WeightMachineForBaby implements WeightMachine {
    public double getWeightInPound() {
        return 0.0;
    }
}


public interface WeightMachineAdapter {
    public double getWeightInKg();
}


public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    private WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    public double getWeightInKg() {
        return weightMachine.getWeightInPound() * 0.453592;
    }
}


public class Main {
    public static void main(String[] args) {
        WeightMachine weightMachine = new WeightMachineForBaby();
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(weightMachine);
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}