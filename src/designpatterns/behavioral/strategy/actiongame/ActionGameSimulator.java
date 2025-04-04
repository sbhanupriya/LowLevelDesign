package designpatterns.behavioral.strategy.actiongame;

import designpatterns.behavioral.strategy.actiongame.behaviour.SwordBehaviour;

public class ActionGameSimulator {
    public static void main(String[] args){
        System.out.println("King");
        King king = new King();
        king.attack();

        System.out.println("Queen");
        Queen queen = new Queen();
        queen.attack();
        queen.setWeaponBehaviour(new SwordBehaviour());
        queen.attack();
    }
}
