package designpatterns.creational.builder;

public class Car {
    private String engine;
    private int wheels;
    private int seats;
    private String color;
    private boolean sunroof;
    private boolean navigationSystem;

    private Car(CarBuilder builder){
        this.color = builder.color;
        this.seats = builder.seats;
        this.wheels = builder.wheels;
        this.engine = builder.engine;
        this.sunroof = builder.sunroof;
        this.navigationSystem = builder.navigationSystem;
    }
    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public int getWheels() {
        return wheels;
    }

    public String getEngine() {
        return engine;
    }

    public boolean isNavigationSystem() {
        return navigationSystem;
    }

    public boolean isSunroof() {
        return sunroof;
    }
    @Override
    public String toString(){
        return "Car [engine=" + engine + "], [wheels=" + wheels + "], [seats=" + seats + "], [color=" + color + "], [sunroof=" + sunroof + "], [navigation" + navigationSystem + "]";
    }
    public static class CarBuilder{
        private String engine;
        private int wheels = 4;
        private int seats = 5;
        private String color = "Black";
        private boolean sunroof = false;
        private boolean navigationSystem = false;

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public CarBuilder setWheels(int wheels){
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }
        public CarBuilder setNavigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
