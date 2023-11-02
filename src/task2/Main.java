package task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("X","Toyota",2023,40000,"white", 10);
        Car car1 = new Car("Land Cruiser","Toyota",2020,50000,"Black",20);
        System.out.println(car);
        System.out.println(car1);
        System.out.println("Are they equal ? " + car.equals(car1));
        System.out.println("Car hashcode   : " + car.hashCode());
        System.out.println("Car1 hashcode  : " + car1.hashCode());
    }
}
