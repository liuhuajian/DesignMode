package com.smartx.tank.mvpapplicationtest.mediator;

/**
 * Created by messi on 17/7/10.
 */

public class CollectionA extends AbstractCollection {
    @Override
    public void setNumber(int number, AbstractMediator mediator) {
        this.number = number;
        mediator.AffectB();
    }
}
