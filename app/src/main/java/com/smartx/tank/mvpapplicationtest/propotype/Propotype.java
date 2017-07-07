package com.smartx.tank.mvpapplicationtest.propotype;

/**
 * 创建原型模式
 * Created by messi on 17/7/7.
 */

public class Propotype implements Cloneable {
    @Override
    public Propotype clone() {
        Propotype clone = null;
        try {
            clone= (Propotype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
