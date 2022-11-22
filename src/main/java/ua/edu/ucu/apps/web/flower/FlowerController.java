package ua.edu.ucu.apps.web.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.FlowerStore.flower.Flower;

import java.util.List;

@RestController
@RequestMapping(path = "/flower")
public class FlowerController {
    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public Flower getFlowers(){
        return flowerService.getFlowerExample();
    }
}
