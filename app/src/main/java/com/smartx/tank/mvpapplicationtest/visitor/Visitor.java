package com.smartx.tank.mvpapplicationtest.visitor;

/**
 * Created by messi on 17/7/11.
 */

public class Visitor implements IVisitor {
    @Override
    public void visit(Element element) {
        element.doSomething();
    }
}
