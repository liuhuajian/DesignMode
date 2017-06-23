package com.smartx.tank.mvpapplicationtest.decorate;

/**
 * Created by messi on 17/6/23.
 */

public class BlueJewelryEquip implements IJewelryEquip {

    private IEquip equip;

    public BlueJewelryEquip(IEquip equip){
        this.equip = equip;
    }

    @Override
    public int calculateAttack() {
        return equip.calculateAttack()+5;
    }

    @Override
    public String description() {
        return equip.description()+" 蓝宝石";
    }
}
