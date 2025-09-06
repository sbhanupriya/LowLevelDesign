package designpatterns.behavioral.decorator.character;

public class HeightUp extends Decorator{
    public HeightUp(Character character){
        super(character);
    }

    @Override
    void getAbilities() {
        character.getAbilities();
        System.out.print(" with height up ");
    }
}
