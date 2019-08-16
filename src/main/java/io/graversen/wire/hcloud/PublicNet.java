package io.graversen.wire.hcloud;

public class PublicNet {
    private final Ipv4 ipv4;

    public PublicNet(Ipv4 ipv4) {
        this.ipv4 = ipv4;
    }

    public Ipv4 getIpv4() {
        return ipv4;
    }
}
