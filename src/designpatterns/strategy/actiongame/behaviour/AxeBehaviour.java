package designpatterns.strategy.actiongame.behaviour;

public class AxeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("AXE!!!");
    }
}
