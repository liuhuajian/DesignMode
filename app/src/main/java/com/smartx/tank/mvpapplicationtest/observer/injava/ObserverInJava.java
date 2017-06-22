package com.smartx.tank.mvpapplicationtest.observer.injava;

import com.smartx.tank.mvpapplicationtest.Logger;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by messi on 17/6/22.
 */

public class ObserverInJava implements Observer {

    public ObserverInJava(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectAInJava){
            String msg = ((SubjectAInJava) o).getMsg();
            Logger.d(o.getClass().getName()+"--send msg-->"+msg);
        }else if (o instanceof SubjectBInJava){
            String msg = ((SubjectBInJava) o).getMsg();
            Logger.d(o.getClass().getName()+"--send msg-->"+msg);
        }
    }
}
