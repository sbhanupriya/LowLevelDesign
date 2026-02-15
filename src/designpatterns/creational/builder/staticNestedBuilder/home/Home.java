package designpatterns.creational.builder.staticNestedBuilder.home;

public class Home {
    private String roof;
    private String window;
    private int room;

    private Home(HomeBuilder builder){
        this.roof = builder.roof;
        this.room = builder.room;
        this.window = builder.window;
    }

    @Override
    public String toString() {
        return "Home-> " + roof + " roof," + window + " windows, " + room + " rooms";
    }

    public static class HomeBuilder{
        private int room;
        private String window;
        private String roof;

        public HomeBuilder setRoom(int room){
            this.room = room;
            return this;
        }

        public HomeBuilder setWindow(String window){
            this.window = window;
            return this;
        }

        public HomeBuilder setRoof(String roof){
            this.roof = roof;
            return this;
        }

        public Home build(){
            return new Home(this);
        }
    }
}
