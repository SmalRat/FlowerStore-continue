package ua.edu.ucu.apps.FlowerStore.flowers;

import ua.edu.ucu.apps.FlowerStore.flower.Flower;
import ua.edu.ucu.apps.FlowerStore.flower.FlowerColor;

public class Tulip extends Flower {
    public Tulip(){
        super();
    }
    public Tulip(FlowerColor color, int price, int sepalLength) {
        super(color, price, sepalLength);
    }
}
