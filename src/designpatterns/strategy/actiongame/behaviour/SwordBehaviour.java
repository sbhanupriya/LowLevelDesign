package designpatterns.strategy.actiongame.behaviour;

public class SwordBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("SWORD!!!");
    }
}
