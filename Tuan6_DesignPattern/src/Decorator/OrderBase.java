package Decorator;

import java.util.List;

public class OrderBase implements Order{
    private String id;

    public OrderBase(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }


    @Override
    public void doTask() {

    }
}
