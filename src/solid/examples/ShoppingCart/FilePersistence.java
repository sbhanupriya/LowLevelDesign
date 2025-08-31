package solid.examples.ShoppingCart;

public class FilePersistence extends Persistence{
    public FilePersistence(ShoppingCart cart){
        super(cart);
    }
    @Override
    public void save() {
        System.out.println("Save to File");
        for(Product product: shoppingCart.getProductList()){
            System.out.println("Product:" + product.getName()+ " " + product.getPrice());
        }
        System.out.println();
    }
}
