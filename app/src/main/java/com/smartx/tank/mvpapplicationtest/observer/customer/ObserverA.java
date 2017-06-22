package com.smartx.tank.mvpapplicationtest.observer.customer;

import com.smartx.tank.mvpapplicationtest.Logger;

/**
 * Created by messi on 17/6/22.
 */

public class ObserverA implements Observer {

    public ObserverA(Subject subject){
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        Logger.d(this.getClass().getName()+"get message--->"+msg);
    }
}
