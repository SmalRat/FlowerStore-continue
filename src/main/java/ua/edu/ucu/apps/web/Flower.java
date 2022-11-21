package ua.edu.ucu.apps.web;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower {
    private String color;
    private int price;
    private int sepalLength;
    public Flower(String color, int price, int sepalLength){
        this.color = color;
        this.price = price;
        this.sepalLength = sepalLength;
    }
}
