package designpatterns.behavioral.decorator.character;

public class MarioExecutor {
    public static void main(String[] agrs){
        Character character = new Mario();
        character.getAbilities();
        character = new HeightUp(character);
        character.getAbilities();
        character = new Gun(character);
        character.getAbilities();
    }
}
