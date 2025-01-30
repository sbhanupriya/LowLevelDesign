package designpatterns.strategy.actiongame;

import designpatterns.strategy.actiongame.behaviour.AxeBehaviour;

public class Knight extends Character{
    public Knight() {
        super(new AxeBehaviour());
    }
}
