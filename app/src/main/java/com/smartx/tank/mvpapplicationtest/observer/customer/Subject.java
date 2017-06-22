package com.smartx.tank.mvpapplicationtest.observer.customer;

/**
 * Created by messi on 17/6/22.
 */

public interface Subject {
    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyAllObserver();

}
