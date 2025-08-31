package solid.examples.ShoppingCart;

public class SqlPersistence extends Persistence{
    public SqlPersistence(ShoppingCart shoppingCart){
        super(shoppingCart);
    }
    @Override
    public void save() {
        System.out.println("Save to Sql DB");
    }
}
