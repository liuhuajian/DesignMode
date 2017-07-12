package com.smartx.tank.mvpapplicationtest.visitor;

/**
 * Created by messi on 17/7/11.
 */

public abstract class Element {
    public abstract void accept(IVisitor visitor);
    public abstract void doSomething();
}
