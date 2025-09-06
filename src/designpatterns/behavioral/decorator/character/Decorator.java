package designpatterns.behavioral.decorator.character;

public abstract class Decorator extends Character {
    protected Character character;
    public Decorator(Character character){
        this.character = character;
    }
}
