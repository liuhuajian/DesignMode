package com.smartx.tank.mvpapplicationtest.mediator;

/**
 * Created by messi on 17/7/10.
 */

public class Mediator extends AbstractMediator {
    public Mediator(AbstractCollection a, AbstractCollection b) {
        super(a, b);
    }

    @Override
    public void AffectA() {
        int number = B.getNumber();
        A.setNumber(number * 100);
    }

    @Override
    public void AffectB() {
        int number = A.getNumber();
        B.setNumber(number / 100);
    }
}
