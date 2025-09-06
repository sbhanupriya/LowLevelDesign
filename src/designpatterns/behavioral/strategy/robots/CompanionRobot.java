package designpatterns.behavioral.strategy.robots;

import designpatterns.behavioral.strategy.robots.interfaces.Flyable;
import designpatterns.behavioral.strategy.robots.interfaces.Talkable;
import designpatterns.behavioral.strategy.robots.interfaces.Walkable;

public class CompanionRobot extends Robot {
    public CompanionRobot(Flyable flyable, Talkable talkable, Walkable walkable){
        super(flyable,walkable,talkable);
    }
    @Override
    public void projection() {
        System.out.println("I am Companion Robot designed to household needs");
    }
}
