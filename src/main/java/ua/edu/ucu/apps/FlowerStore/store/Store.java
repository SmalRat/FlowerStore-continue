package ua.edu.ucu.apps.FlowerStore.store;

import ua.edu.ucu.apps.FlowerStore.groups.instancesclasses.FlowerBucket;
import ua.edu.ucu.apps.FlowerStore.groups.specs.FlowerBucketSpecs;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> availableBuckets = new ArrayList<FlowerBucket>();

    public List<FlowerBucket> search(FlowerBucketSpecs pattern) {
        List<FlowerBucket> result = new ArrayList<>();
        for (FlowerBucket flowerBucket : availableBuckets) {
            if (flowerBucket.matches(pattern)) {
                result.add(flowerBucket);
            }
        }
        return result;
    }

    public void addBucket(FlowerBucket flowerBucket) {
        availableBuckets.add(flowerBucket);
    }
}
