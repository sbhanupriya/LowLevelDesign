package designpatterns.behavioral.strategy.robots;

import designpatterns.behavioral.strategy.robots.implementations.*;

public class RobotSimulation {
    public static void main(String[] args){
        Robot companion = new CompanionRobot(new FlyWithWings(), new NormalTalk(), new NormalWalk());
        Robot worker = new WorkerRobot(new FlyWithJet(), new NoWalk(), new NoTalk());

        companion.projection();
        companion.fly();
        companion.talk();
        companion.walk();
        
        worker.projection();
        worker.fly();
        worker.walk();
        worker.talk();
    }
}
