package solid.examples.lsv;

public class RulesExecutor {
    public static  void main(String[] args){
        Parent parent = new Parent();
        Parent child = new Child();

        Organism organism = new Organism();
        Dog dog = new Dog();
        Animal animal = new Animal();

        System.out.println("Checking Method Argument Type Rule - It should be same neither narrower or broader");
        parent.solve(dog);
        parent.solve(animal);
        //but internally you can represent dog using animal so it works.
       // parent.solve(organism);  compile time error, method argument cannot be broad

        System.out.println("Checking Return Type Rule -  Return type can be narrower in child class");
        parent.getAnimal().print();
        child.getAnimal().print();

        System.out.println("Trying exception");

        try {
            parent.impossible();
        } catch (IndexOutOfBoundsException e){
            System.out.println("Exception caught by parent");
        }

        try {
            child.impossible();
        } catch (IndexOutOfBoundsException e){
            System.out.println("Exception caught by child");
        }
    }
}
