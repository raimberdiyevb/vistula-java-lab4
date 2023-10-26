package task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("X","Tesla",2023,40000,"white", 10);
        System.out.println(car);
        car.sell(4);
        System.out.println(car.getModel());
        System.out.println(car.getBrand());
        System.out.println(car.getYear());
        System.out.println(car.getPrice());
        System.out.println(car.getColor());
        System.out.println(car.getQuantity());
        car.setPrice(50000);
        car.setColor("black");
        System.out.println(car);
    }
}
