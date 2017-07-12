package com.smartx.tank.mvpapplicationtest.visitor;

import com.smartx.tank.mvpapplicationtest.Logger;

/**
 * Created by messi on 17/7/11.
 */

public class ElementOne extends Element {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void doSomething() {
        Logger.d("ElementOne--->doSomething");
    }
}
