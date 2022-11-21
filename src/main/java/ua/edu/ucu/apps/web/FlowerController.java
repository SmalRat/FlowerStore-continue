package ua.edu.ucu.apps.web;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers(){
        return List.of(new Flower("green", 50, 100), new Flower("blue", 40, 80), new Flower("maroon", 60, 120));

    }
}
