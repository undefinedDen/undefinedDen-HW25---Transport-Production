package app.service.transpotrFactory;


import app.entity.transport.Transport;

public abstract class TransportFactory  {
  public abstract Transport createTransport ();

  public String description(){
      Transport transport = createTransport();
      return "Transport - " + transport.brand() + " was created! " + transport.move();
  }

}
