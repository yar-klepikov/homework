package homework_5;

public class MachineLoading<T, K> {
    private T passengers;
    private K weight;

    public MachineLoading(T passengers, K weight) {
        this.passengers = passengers;
        this.weight = weight;
    }
    public K getWeight() {
        return weight;
    }
    public T getPassengers() {
        return passengers;
    }
}
