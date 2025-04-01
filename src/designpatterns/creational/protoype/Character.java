package designpatterns.creational.protoype;

public class Character implements  Cloneable{

    private String name;
    private int health;
    private int attackPower;
    private int level;
    public Character(String name, int health, int power, int level){
        this.name = name;
        this.health = health;
        this.attackPower = power;
        this.level = level;
    }
    @Override
    public Character clone() throws CloneNotSupportedException {
        return (Character) super.clone();
    }
    public void showCharacterInfo(){
        System.out.println("Character [name="+ name + "],[health=" +health + "],[attackpower="+ attackPower + "],[level="+level + "]");
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHealth(int health){
        this.health = health;
    }
    public void setAttackPower(int attackPower){
        this.attackPower = attackPower;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
