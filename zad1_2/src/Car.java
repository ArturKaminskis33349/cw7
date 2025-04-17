public class Car extends Vehicle {
    private int numberOfSeats;

    public Car() {
    }
    @Override
    public void start(){
        System.out.println("Car start");
    }
    @Override
    public void stop(){
        System.out.println("Car stop");
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
