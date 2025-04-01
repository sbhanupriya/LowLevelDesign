package designpatterns.creational.protoype;

public class CharacterSimulator {
    public static void main(String[] args) throws CloneNotSupportedException {
        CharacterFactory factory = new CharacterFactory();
        Character character = factory.getCharacterWithName("Bhanu");
        character.showCharacterInfo();

        character = factory.getCharacterWithHealth(1000);
        character.showCharacterInfo();


        character = factory.getCharacterWithPower(100);
        character.showCharacterInfo();
    }
}
