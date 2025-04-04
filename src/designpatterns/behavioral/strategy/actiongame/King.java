package designpatterns.behavioral.strategy.actiongame;

import designpatterns.behavioral.strategy.actiongame.behaviour.SwordBehaviour;

public class King extends Character{
    public King() {
        super(new SwordBehaviour());
    }
}
