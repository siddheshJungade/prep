public interface DriveInterface {
	public void drive()
}

public class XyzDriveStrategy implements DriveInterface{
	@Override
	public void drive() {
		// XYZ Drive capbility
		System.out.println("XYZ Drive capbility");
	}
}



public class SupperDriveStrategy implements DriveInterface{
	@Override
	public void drive() {
		// Supper Drive Capbility
		System.out.println("Supper Drive Capbility");
	}
}


// ------------- This is base Class ------------- 
public class Vehicle {
	DriveInterface obj;
	// Constructor Injection
	Vehicle(DriveInterface obj) { this.obj = obj;} 

	public void drive() {
		this.obj.drive();
	}
}

// Here offroad and sport 2 child are having common drive capabilities
public class SportVehicle extends Vehicle {
	SportVehicle() {
		supper(new SupperDriveStrategy());
	}
}
public class OffRoadVehicle extends Vehicle {
	SportVehicle() {
		supper(new SupperDriveStrategy());
	}
}

public class NormalVehicle extends Vehicle {
	SportVehicle() {
		supper(new XyzDriveStrategy());
	}
}

// Here we are using Strategy pattern to change the drive capability of the vehicle

public class Main {
	public static void main(String[] args) {
		Vehicle sport = new SportVehicle();
		sport.drive();

		Vehicle offroad = new OffRoadVehicle();
		offroad.drive();

		Vehicle normal = new NormalVehicle();
		normal.drive();
	}
}
