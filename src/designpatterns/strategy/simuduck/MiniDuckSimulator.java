package designpatterns.strategy.simuduck;

import designpatterns.strategy.simuduck.implementations.FlyRocketPowered;
import designpatterns.strategy.simuduck.models.Duck;
import designpatterns.strategy.simuduck.models.MallardDuck;
import designpatterns.strategy.simuduck.models.ModelDuck;

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
