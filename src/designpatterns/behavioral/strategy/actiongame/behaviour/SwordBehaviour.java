package designpatterns.behavioral.strategy.actiongame.behaviour;

public class SwordBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("SWORD!!!");
    }
}
