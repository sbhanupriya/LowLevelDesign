package designpatterns.behavioral.decorator.character;

public class Gun extends Decorator{
    public Gun(Character ch){
        super(ch);
    }

    @Override
    void getAbilities() {
        this.character.getAbilities();
        System.out.print(" with gun");
    }
}
