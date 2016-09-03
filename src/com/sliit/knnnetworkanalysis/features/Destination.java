package com.sliit.knnnetworkanalysis.features;

public class Destination extends Feature{
    
    private final Destinations DESTINATION;
    
    public Destination(Destinations destination) {
        super(destination.name());
        this.DESTINATION = destination;
    }

    public enum Destinations {
        destination1,
        destination2,
        destination3,
        destination4
    }

    @Override
    void calculateDistances() {
        setDistance(DESTINATION.ordinal());
    }
}
