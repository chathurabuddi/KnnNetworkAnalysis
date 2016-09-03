package com.sliit.knnnetworkanalysis.features;

public class Source extends Feature{

    private final Sources SOURCE;
    
    public Source(Sources source) {
        super(source.name());
        this.SOURCE = source;
    }

    public enum Sources {
        source1,
        source2,
        source3,
        source4
    }

    @Override
    void calculateDistances() {
        setDistance(SOURCE.ordinal());
    }
    
}
