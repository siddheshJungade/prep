
public interface Vehicle {
    public void drive();
    public int getSpeed();
    public int getTankCapacity();
}


public class Car implements Vehicle {
    private int speed;
    private int tankCapacity;

    public Car(int speed, int tankCapacity) {
        this.speed = speed;
        this.tankCapacity = tankCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Driving car with speed: " + speed);
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getTankCapacity() {
        return tankCapacity;
    }
}


public NullObject implements Vehicle {
    @Override
    public void drive() {
        System.out.println("No vehicle to drive");
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public int getTankCapacity() {
        return 0;
    }
}


public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        if ('Car'.equalsIgnoreCase(vehicleType)) {
            return new Car(100, 50);
        } 
        return new NullObject();
    
    }
}


public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("Car");
        car.drive();
        System.out.println("Car speed: " + car.getSpeed());
        System.out.println("Car tank capacity: " + car.getTankCapacity());
    
        Vehicle bike = VehicleFactory.getVehicle("Bike");
        bike.drive();
        System.out.println("Bike speed: " + bike.getSpeed());
        System.out.println("Bike tank capacity: " + bike.getTankCapacity());
    }
}