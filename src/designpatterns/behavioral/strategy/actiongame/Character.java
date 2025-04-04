package designpatterns.behavioral.strategy.actiongame;

import designpatterns.behavioral.strategy.actiongame.behaviour.WeaponBehaviour;

public class Character {
    WeaponBehaviour weaponBehaviour;
    public Character(WeaponBehaviour behaviour){
        this.weaponBehaviour = behaviour;
    }
    public void setWeaponBehaviour(WeaponBehaviour behaviour){
        this.weaponBehaviour = behaviour;
    }
    public void attack(){
        this.weaponBehaviour.useWeapon();
    }
}
