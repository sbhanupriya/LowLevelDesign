package solid.examples.ShoppingCart;

public abstract class Persistence {
    public Persistence(ShoppingCart cart){
        this.shoppingCart = cart;
    }
    protected ShoppingCart shoppingCart;
    public abstract void save();
}
