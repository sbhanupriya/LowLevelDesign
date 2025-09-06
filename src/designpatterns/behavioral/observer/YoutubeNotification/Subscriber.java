package designpatterns.behavioral.observer.YoutubeNotification;



public class Subscriber implements Observer{
    private YoutubeChannel channel;
    private String name;
    public Subscriber(YoutubeChannel channel, String name){
        this.channel = channel;
        this.name = name;
    }
    public void update(){
        System.out.println("Hi " + name + this.channel.getLatestVideo());
    }
}
