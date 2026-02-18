package designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class AirForce implements Aggregate<IAircraft>{
    List<FighterPlane> fighters;
    Boeing[] boeing;
    int index = 0;
    public AirForce(){
        index = 0;
        boeing = new Boeing[15];
        fighters = new ArrayList<>();
    }
    public List<FighterPlane> getFighters(){
        return fighters;
    }
    public Boeing[] getBoeing(){
        return boeing;
    }
    public int getSize(){
        return index;
    }
    public void addFighter(FighterPlane fighterPlane){
        fighters.add(fighterPlane);
    }
    public void addBoeing(Boeing boeing){
        if(index==this.boeing.length)
            throw new IllegalArgumentException("Not enough space");
        this.boeing[index++] = boeing;
    }
    @Override
    public Iterator<IAircraft> createIterator() {
        return new ConcreteAirforceIteraor(fighters,boeing, index);
    }
}
