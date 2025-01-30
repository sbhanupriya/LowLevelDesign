package designpatterns.strategy.actiongame.behaviour;

public class KnifeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("KNIFE!!!!");
    }
}
