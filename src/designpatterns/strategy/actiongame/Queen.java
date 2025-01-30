package designpatterns.strategy.actiongame;

import designpatterns.strategy.actiongame.behaviour.BowAndArrowBehaviour;

public class Queen extends Character{
    public Queen() {
        super(new BowAndArrowBehaviour());
    }
}
