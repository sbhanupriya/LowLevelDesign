package designpatterns.behavioral.strategy.robots;

import designpatterns.behavioral.strategy.robots.interfaces.Flyable;
import designpatterns.behavioral.strategy.robots.interfaces.Talkable;
import designpatterns.behavioral.strategy.robots.interfaces.Walkable;

public class WorkerRobot extends Robot {
    public WorkerRobot(Flyable flyable, Walkable walkable, Talkable talkable){
        super(flyable,walkable,talkable);
    }
    @Override
    public void projection() {
        System.out.println("I am worker robot designed to do industrial work");
    }
}
