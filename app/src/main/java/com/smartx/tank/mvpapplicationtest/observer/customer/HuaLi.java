package com.smartx.tank.mvpapplicationtest.observer.customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by messi on 17/6/22.
 */

public class HuaLi implements Subject {

    private List<Observer> observerList = new ArrayList<>();
    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        int indexOf = observerList.indexOf(observer);
        if (indexOf>=0){
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer:observerList){
            observer.update(msg);
        }
    }

    public void sendMsg(String msg){
        this.msg = msg;
        notifyAllObserver();
    }
}

