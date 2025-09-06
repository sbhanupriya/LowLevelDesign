package designpatterns.behavioral.observer.YoutubeNotification;

public class YoutubeNotificationExecutor {
    public static void main(String[] agrs){
        YoutubeChannel channel = new YoutubeChannel("Take You Ahead");

        Subscriber bhanu = new Subscriber(channel, "Bhanu");
        Subscriber aryan = new Subscriber(channel, "Aryan");

        channel.subsrcribe(bhanu);
        channel.subsrcribe(aryan);

        channel.uploadVideo("LLD Observer Pattern");
        channel.unsubsuscribe(aryan);
        channel.uploadVideo("Microsoft Inteview Experience");
    }
}
