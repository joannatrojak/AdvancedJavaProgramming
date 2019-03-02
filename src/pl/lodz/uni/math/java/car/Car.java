package pl.lodz.uni.math.java.car;
public class Car {
    private int numberOfPassengers;

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public Car() {
        numberOfPassengers = 0;
    }
    public static void main(String[] args){
        Car c1, c2, c3;
        c1 = new Car();
        c1.setNumberOfPassengers(2);
        c2 = c1;
        c3 = new Car();
        c3.setNumberOfPassengers(2);

        System.out.println("Number of passangers in c1: " + c1.getNumberOfPassengers());
        System.out.println("Number of passangers in c2: " + c2.getNumberOfPassengers());
        System.out.println(c3.getNumberOfPassengers());
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c3));

    }
}
