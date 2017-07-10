package com.smartx.tank.mvpapplicationtest.mediator;

/**
 * Created by messi on 17/7/10.
 */

public abstract class AbstractMediator {
    protected AbstractCollection A;
    protected AbstractCollection B;
    public AbstractMediator(AbstractCollection a,AbstractCollection b){
        A = a;
        B = b;
    }

    public abstract void AffectA();
    public abstract void AffectB();
}
