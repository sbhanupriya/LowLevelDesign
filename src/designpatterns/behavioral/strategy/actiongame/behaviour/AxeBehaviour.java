package designpatterns.behavioral.strategy.actiongame.behaviour;

public class AxeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("AXE!!!");
    }
}
