public class Truck extends Vehicle{

    private int currentWeight;
    private final int maxWeight;

    public Truck(String name, int wheels, int maxWeight) {
        super(name, wheels);
        this.maxWeight = maxWeight;
        currentWeight = 0;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void loadTruck(int weight) {
        if(currentWeight + weight <= maxWeight) {
            currentWeight += weight;
            System.out.println("The cargo weighing " + weight + " pounds has been loaded. The truck now holds " + currentWeight + " pounds");
        } else {
            System.out.println("The truck would be too heavy!");
        }
    }

}