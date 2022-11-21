package ua.edu.ucu.apps.FlowerStore.flowers;

import ua.edu.ucu.apps.FlowerStore.flower.Flower;
import ua.edu.ucu.apps.FlowerStore.flower.FlowerColor;

public class Rose extends Flower {
    public Rose(){
        super();
    }
    public Rose(FlowerColor color, int price, int sepalLength) {
        super(color, price, sepalLength);
    }
}
