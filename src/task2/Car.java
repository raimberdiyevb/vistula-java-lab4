package task2;

import lombok.*;


@Data
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Car {

    private String model;
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
}
