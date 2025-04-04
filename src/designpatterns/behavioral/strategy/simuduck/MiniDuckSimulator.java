package designpatterns.behavioral.strategy.simuduck;

import designpatterns.behavioral.strategy.simuduck.implementations.FlyRocketPowered;
import designpatterns.behavioral.strategy.simuduck.models.Duck;
import designpatterns.behavioral.strategy.simuduck.models.MallardDuck;
import designpatterns.behavioral.strategy.simuduck.models.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck duck = new MallardDuck();
        duck.performFylwable();
        duck.performQuack();

        Duck model = new ModelDuck();
        model.performFylwable();
        model.setFlywable(new FlyRocketPowered());
        model.performFylwable();
    }
}
