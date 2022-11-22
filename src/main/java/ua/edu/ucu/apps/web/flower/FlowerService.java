package ua.edu.ucu.apps.web.flower;

import org.springframework.stereotype.Service;
import ua.edu.ucu.apps.FlowerStore.flower.Flower;
import ua.edu.ucu.apps.FlowerStore.flower.FlowerColor;

import java.util.List;

@Service
public class FlowerService {
    public Flower getFlowerExample(){
        return new Flower(FlowerColor.BLUE, 50, 100);
    }
}
