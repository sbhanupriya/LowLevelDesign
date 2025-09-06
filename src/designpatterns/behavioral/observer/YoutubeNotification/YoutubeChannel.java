package designpatterns.behavioral.observer.YoutubeNotification;



import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Observable {
    private List<Observer> observerList;
    private String name;
    private String latestVideo;
    public YoutubeChannel(String name ){
        observerList = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void subsrcribe(Observer observer) {
        if(observerList.contains(observer)==false){
            observerList.add(observer);
        }
    }

    @Override
    public void unsubsuscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(Observer observer: observerList){
            observer.update();
        }
    }
    public void uploadVideo(String title){
        latestVideo = title;
        System.out.println(name + " uploaded " + title);
        notifySubscribers();
    }
    public String getLatestVideo(){
        return " Check our latest video " + latestVideo;
    }
}
