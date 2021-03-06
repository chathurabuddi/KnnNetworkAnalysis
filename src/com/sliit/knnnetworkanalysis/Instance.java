package com.sliit.knnnetworkanalysis;

import com.sliit.knnnetworkanalysis.features.Feature;
import java.util.List;

public class Instance{
    private List<Feature> features;
    private boolean fraudStatus;

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFraudStatus(boolean fraudStatus) {
        this.fraudStatus = fraudStatus;
    }
    
    public boolean getFraudStatus() {
        return fraudStatus;
    }

    public boolean isFraud() {
        return fraudStatus;
    }
}
