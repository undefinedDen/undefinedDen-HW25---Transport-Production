package app.entity.transport.implementationTransport;

import app.entity.transport.Transport;

public class Plane implements Transport {
    String brand;

    public Plane(String brand) {
        this.brand = brand;
    }

    public String brand() {
        return "Plane, brand: \"" + brand + "\"";
    }

    @Override
    public String move() {
        return "It will fly into the sky!";
    }
}
