package com.smartx.tank.mvpapplicationtest.observer.injava;

import java.util.Observable;

/**
 * Created by messi on 17/6/22.
 */

public class SubjectAInJava extends Observable {

    private String msg;

    public String getMsg(){
        return msg;
    }
    public void sendMsg(String msg){
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
