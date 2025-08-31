package solid.examples.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> productList;
    public ShoppingCart(){
        productList = new ArrayList<>();
    }
    public void addProduct(Product product){
        this.productList.add(product);
    }
    public Double calculatePrice(){
        Double price = 0.0;
        for(Product product: productList){
            price += product.getPrice();
        }
        return price;
    }
    public List<Product> getProductList(){
        return productList;
    }
}
