package com.sliit.knnnetworkanalysis.features;

public class Protocol extends Feature{

    private final Protocols PROTOCOL;
    
    public Protocol(Protocols protocol) {
        super(protocol.name());
        PROTOCOL = protocol;
    }
    
    public enum Protocols {
        Udp,
        Arp,
        IP,
        Tcp
    }

    @Override
    void calculateDistances() {
        setDistance(PROTOCOL.ordinal());
    }
    
}
