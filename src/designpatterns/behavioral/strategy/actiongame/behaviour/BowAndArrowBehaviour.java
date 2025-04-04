package designpatterns.behavioral.strategy.actiongame.behaviour;

public class BowAndArrowBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("BOW AND ARROW!!!!");
    }
}
