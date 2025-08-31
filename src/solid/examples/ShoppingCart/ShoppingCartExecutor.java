package solid.examples.ShoppingCart;
//solution of Single Responsibility Principle + Open Closed Principle
public class ShoppingCartExecutor {
    public static void main(String[] args){
        Product camera = new Product("camera", 1200.0);
        Product tv = new Product("tv", 2500.0);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(camera);
        shoppingCart.addProduct(tv);

        Persistence file = new FilePersistence(shoppingCart);
        Persistence mongo = new MongoPersistence(shoppingCart);
        Persistence sql = new SqlPersistence(shoppingCart);


        file.save();
        mongo.save();
        sql.save();

        System.out.println(shoppingCart.calculatePrice());
    }
}
