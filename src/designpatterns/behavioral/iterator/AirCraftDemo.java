package designpatterns.behavioral.iterator;

public class AirCraftDemo {
    public static void main(String[] args){
        AirForce airForce = new AirForce();
        airForce.addBoeing(new Boeing("AK"));
        airForce.addBoeing(new Boeing("UM"));

        airForce.addFighter(new FighterPlane("FF01"));
        airForce.addFighter(new FighterPlane("FF02"));
        airForce.addFighter(new FighterPlane("FF03"));
        airForce.addFighter(new FighterPlane("FF04"));


        Iterator<IAircraft> aircraftIterator = airForce.createIterator();

        while(aircraftIterator.hasNext()){
            aircraftIterator.next().fly();
        }
    }
}
