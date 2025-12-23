package designpatterns.behavioral.interpreter.expressionEvaluator;

import java.util.HashMap;

public class Context {
    private HashMap<String,Integer> map;
    public Context(){
        map = new HashMap<>();
    }
    public void add(String key, Integer val){
        map.put(key, val);
    }
    public int get(String key){
        return map.get(key);
    }
}
