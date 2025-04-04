package designpatterns.behavioral.strategy.actiongame;

import designpatterns.behavioral.strategy.actiongame.behaviour.AxeBehaviour;

public class Knight extends Character{
    public Knight() {
        super(new AxeBehaviour());
    }
}
