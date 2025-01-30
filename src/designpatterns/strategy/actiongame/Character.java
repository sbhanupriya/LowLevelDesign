package designpatterns.strategy.actiongame;

import designpatterns.strategy.actiongame.behaviour.WeaponBehaviour;

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
