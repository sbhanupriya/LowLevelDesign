package designpatterns.creational.objectpool;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class DBPoolManager {

    private Deque<DBConnection> activeConnections;
    private Set<DBConnection> inUseConnections;
    private int MAX_POOL_SIZE;
    private int INITIAL_POOL_SIZE;

    private DBPoolManager(int max, int inital){
        MAX_POOL_SIZE = max;
        INITIAL_POOL_SIZE = inital;
        activeConnections = new ArrayDeque<>();
        inUseConnections = new HashSet<>();
        for(int i=1;i<=INITIAL_POOL_SIZE;i++)
            activeConnections.offerLast(new DBConnection());
    }

    private static volatile DBPoolManager instance;
    public static DBPoolManager getInstance(){
        if(instance==null){
            synchronized (DBPoolManager.class){
                if(instance==null)
                instance = new DBPoolManager(5,3);
            }
        }
        return instance;
    }

    public synchronized DBConnection getConnection() throws InterruptedException {

        while(activeConnections.isEmpty() && inUseConnections.size()==MAX_POOL_SIZE){
            wait();
        }
        if(activeConnections.isEmpty()){
            activeConnections.add(new DBConnection());
        }
        DBConnection connection = activeConnections.pollFirst();
        inUseConnections.add(connection);
        return connection;
    }

    public synchronized void returnConnection(DBConnection connection){
        if(!inUseConnections.remove(connection)){
            throw  new RuntimeException("Invalid return");
        }
        activeConnections.offerLast(connection);
        notify();
    }
}
