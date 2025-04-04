package designpatterns.behavioral.strategy.actiongame;

import designpatterns.behavioral.strategy.actiongame.behaviour.BowAndArrowBehaviour;

public class Queen extends Character{
    public Queen() {
        super(new BowAndArrowBehaviour());
    }
}
