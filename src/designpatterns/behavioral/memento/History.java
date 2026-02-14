package designpatterns.behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<Order.Memento> historyList = new ArrayDeque<>();
    public void track(Order.Memento memento){
        historyList.offerLast(memento);
    }
    public Order.Memento undo(){
        if(historyList.size()==0)
            throw new IllegalArgumentException("No Snapshot saved");
        Order.Memento last = historyList.pollLast();
        return last;
    }
}
