package task2;

import lombok.*;


@Data
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Car {

    private String model;
    @EqualsAndHashCode.Include
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public void delivery(int quantity){
        this.quantity =+ quantity;
    }
    public void sell(int quantity){
        this.quantity -= quantity;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return brand.equals(car.brand);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(brand);
//    }
}
