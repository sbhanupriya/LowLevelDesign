package designpatterns.behavioral.iterator;

import java.util.List;

public class ConcreteAirforceIteraor implements Iterator<IAircraft> {

    List<FighterPlane> planeList;
    IAircraft[] boing;
    int maxSize;
    int index = 0;
    int arrIndex= 0;
    public ConcreteAirforceIteraor(List<FighterPlane> aircrafts, IAircraft[] boing, int maxSIze){
        this.maxSize = maxSIze;
        planeList = aircrafts;
        this.boing = boing;
    }
    @Override
    public IAircraft next() {

        if(index<planeList.size()){
            return planeList.get(index++);
        }

        if(arrIndex<boing.length){
            return boing[arrIndex++];
        }

        throw new IllegalArgumentException("no more planes");
    }

    @Override
    public boolean hasNext() {
        return  index<planeList.size() || arrIndex<maxSize;
    }
}
