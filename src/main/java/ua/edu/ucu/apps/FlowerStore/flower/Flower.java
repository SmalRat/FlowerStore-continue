package ua.edu.ucu.apps.FlowerStore.flower;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    /**
     * Flower class
     */

    @Getter
    private double sepalLength;
    /**
     * Sepal length
     */
    private FlowerColor color;

    /**
     * Color of the flower
     */
    @Getter
    private double price;
    /**
     * The price of flower
     */
    /*@Getter
    private FlowerType flowerType;
    /**
     * Type of flower
     */
    public final String getColor() {
        /**
         * returns color (string)
         */
        return color.toString();
    }
    public Flower(){

    }
    public Flower(FlowerColor color, int price, int sepalLength){
        this.color = color;
        this.price = price;
        this.sepalLength = sepalLength;
    }
}
