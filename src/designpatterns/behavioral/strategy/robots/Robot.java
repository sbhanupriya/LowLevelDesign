package designpatterns.behavioral.strategy.robots;

import designpatterns.behavioral.strategy.robots.interfaces.Flyable;
import designpatterns.behavioral.strategy.robots.interfaces.Talkable;
import designpatterns.behavioral.strategy.robots.interfaces.Walkable;

public abstract class Robot {
    private Flyable flyable;
    private Walkable walkable;
    private Talkable talkable;
    public Robot(Flyable flyable, Walkable walkable,Talkable talkable){
        this.flyable = flyable;
        this.walkable = walkable;
        this.talkable = talkable;
    }
    public abstract void projection();
    public void talk(){
        talkable.talk();
    }
    public void walk(){
        walkable.walk();
    }
    public void fly(){
        flyable.fly();
    }
    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }
    public void setTalkable(Talkable talkable) {
        this.talkable = talkable;
    }
    public void setWalkable(Walkable walkable){
        this.walkable = walkable;
    }
}
