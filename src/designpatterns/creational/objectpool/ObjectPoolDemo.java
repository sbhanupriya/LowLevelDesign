package designpatterns.creational.objectpool;

import java.util.ArrayList;
import java.util.List;

public class ObjectPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        DBPoolManager dbPoolManager = DBPoolManager.getInstance();
        List<DBConnection> connections = new ArrayList<>();
        for(int i=1;i<=5;i++){
           connections.add(dbPoolManager.getConnection());
        }

        connections.get(0).task();
        connections.get(1).task();
        connections.get(2).task();
        connections.get(3).task();
        connections.get(4).task();

        dbPoolManager.returnConnection(connections.get(0));
        dbPoolManager.returnConnection(connections.get(1));
        dbPoolManager.returnConnection(connections.get(2));



    }
}
