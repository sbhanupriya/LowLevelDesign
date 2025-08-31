package solid.examples.lsv;

import java.net.URISyntaxException;
import java.util.zip.ZipError;

public class Parent {
    public void solve(Animal organism){
        organism.print();
    }
    public Animal getAnimal(){
        return new Animal();
    }
    public void impossible(){
        throw new IndexOutOfBoundsException();
    }
}
