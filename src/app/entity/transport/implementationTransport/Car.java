package app.entity.transport.implementationTransport;


import app.entity.transport.Transport;

public class Car implements Transport {
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String brand() {
        return "Car, brand: \"" + brand + "\"";
    }

    @Override
    public String move() {
        return "it will drive by the roads!";
    }
}
