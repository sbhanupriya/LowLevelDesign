package solid.examples.ShoppingCart;

public class MongoPersistence extends Persistence {
    public MongoPersistence(ShoppingCart cart){
        super(cart);
    }
    @Override
    public void save() {
        System.out.println("Save to Mongo DB");
    }
}
