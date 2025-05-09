package app.service.transpotrFactory.factoryForPlane;

import app.controller.ClientController;
import app.entity.transport.Transport;
import app.entity.transport.implementationTransport.Plane;
import app.service.transpotrFactory.TransportFactory;

public class PlaneFactory extends TransportFactory {
        @Override
    public Transport createTransport() {
        return new Plane(ClientController.brand.toUpperCase());
    }
}
