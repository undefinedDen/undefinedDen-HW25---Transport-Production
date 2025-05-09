package app.service.transpotrFactory.factoryForCar;


import app.entity.transport.Transport;
import app.controller.ClientController;
import app.entity.transport.implementationTransport.Car;
import app.service.transpotrFactory.TransportFactory;

public class CarFactory extends TransportFactory {
    @Override
   public Transport createTransport() {

        return new Car(ClientController.brand.toUpperCase());
   }
}
