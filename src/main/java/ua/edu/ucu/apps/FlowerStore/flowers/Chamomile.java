package ua.edu.ucu.apps.FlowerStore.flowers;

import ua.edu.ucu.apps.FlowerStore.flower.Flower;
import ua.edu.ucu.apps.FlowerStore.flower.FlowerColor;

public class Chamomile extends Flower {
    public Chamomile(){
        super();
    }
    public Chamomile(FlowerColor color, int price, int sepalLength) {
        super(color, price, sepalLength);
    }
}
