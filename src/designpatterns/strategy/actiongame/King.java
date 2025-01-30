package designpatterns.strategy.actiongame;

import designpatterns.strategy.actiongame.behaviour.SwordBehaviour;

public class King extends Character{
    public King() {
        super(new SwordBehaviour());
    }
}
