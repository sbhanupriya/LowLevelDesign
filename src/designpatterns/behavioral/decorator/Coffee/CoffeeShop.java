package designpatterns.behavioral.decorator.Coffee;

public class CoffeeShop {
    public static void main(String[] args){
        Coffee coffee = new Espresso();
        coffee = new MilkDecorator(coffee);
        coffee = new VanillaDecorator(coffee);
        System.out.println(" Order : " + coffee.getDescription());
        System.out.println(" Cost : " + coffee.getCost());

        Coffee another = new Cappuccino();
        another = new SugarDecorator(another);
        System.out.println(" Order : " + another.getDescription());
        System.out.println(" Cost : " + another.getCost());

    }
}
