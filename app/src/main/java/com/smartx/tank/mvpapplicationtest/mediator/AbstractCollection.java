package com.smartx.tank.mvpapplicationtest.mediator;

/**
 * 中介者模式
 * Created by messi on 17/7/10.
 */

public abstract class AbstractCollection {
    protected int number;

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public abstract void setNumber(int number,AbstractMediator mediator);
}
