package com.smartx.tank.mvpapplicationtest.decorate;

/**
 * Created by messi on 17/6/23.
 */

public class RingEquip implements IEquip {
    @Override
    public int calculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "戒指";
    }
}
