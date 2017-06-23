package com.smartx.tank.mvpapplicationtest.decorate;

/**
 * Created by messi on 17/6/23.
 */

public class ArmEquip implements IEquip {
    @Override
    public int calculateAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "武器";
    }
}
