package com.smartx.tank.mvpapplicationtest.decorate;

/**
 * Created by messi on 17/6/23.
 */

public class CuffEquip implements IEquip {
    @Override
    public int calculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "护腕";
    }
}
