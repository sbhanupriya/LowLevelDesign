package designpatterns.creational.abstractfactory.Vehicle;

public class VehicleFactoryProvider {
    public static VehicleFactory getFactory(Boolean isRich){
        if(isRich)
            return new LuxuryFactory();
        else
            return new NonLuxuriousFactory();
    }
}
