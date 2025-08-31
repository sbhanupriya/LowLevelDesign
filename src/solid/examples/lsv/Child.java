package solid.examples.lsv;

public class Child extends Parent {
    @Override
    public Dog getAnimal() {
        return new Dog();
    }
    @Override
    public void solve(Animal animal) {
       animal.print();
    }
    @Override
    public void impossible(){
        throw new ArrayIndexOutOfBoundsException();
    }
}
