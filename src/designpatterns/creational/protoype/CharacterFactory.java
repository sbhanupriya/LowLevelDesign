package designpatterns.creational.protoype;

public class CharacterFactory {
    private Character prototypeCharacter;

    public CharacterFactory(){
        prototypeCharacter = new Character("defaultName", 100,50,1);
    }
    public Character getCharacterWithName(String name) throws CloneNotSupportedException {
        Character clonedCharacter = prototypeCharacter.clone();
        clonedCharacter.setName(name);
        return clonedCharacter;
    }
    public Character getCharacterWithHealth(int health) throws CloneNotSupportedException {
        Character clonedCharacter = prototypeCharacter.clone();
        clonedCharacter.setHealth(health);
        return clonedCharacter;
    }
    public Character getCharacterWithPower(int power) throws CloneNotSupportedException {
        Character clonedCharacter = prototypeCharacter.clone();
        clonedCharacter.setAttackPower(power);
        return clonedCharacter;
    }
    public Character getCharacterWithLevel(int level) throws CloneNotSupportedException {
        Character clonedCharacter = prototypeCharacter.clone();
        clonedCharacter.setLevel(level);
        return clonedCharacter;
    }
}
