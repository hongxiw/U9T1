public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn(90);
        myVehicle.brake(0.25);

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(-90); // inherited method
        myCar.brake(0.50); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR TEST CODE BELOW! ----
        // testing all available methods on a Bicycle object
        Bicycle bike = new Bicycle("Bike1", 5);
        bike.move(5);
        bike.turn(5);
        bike.brake(0.50);
        System.out.println(bike.getName());
        System.out.println(bike.getWheels());
        bike.ringBell();
        System.out.println(bike.getGearCount());

        Truck truck = new Truck("Truck1", 6, 1250);
        System.out.println("Name: " + truck.getName());
        System.out.println("Max Weight: " + truck.getMaxWeight());
        System.out.println("Current Weight: " + truck.getCurrentWeight());
        System.out.println("Wheels: " + truck.getWheels());
        truck.loadTruck(500);
        truck.move(500);
        truck.turn(90);
        truck.brake(0.75);
        truck.loadTruck(1000);

    }
}