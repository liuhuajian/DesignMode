package com.smartx.tank.mvpapplicationtest.decorate;

/**
 * Created by messi on 17/6/23.
 */

public class RedJewelryEquip implements IJewelryEquip {

    private IEquip equip;

    public RedJewelryEquip(IEquip equip){
        this.equip = equip;
    }
    @Override
    public int calculateAttack() {
        return equip.calculateAttack()+15;
    }

    @Override
    public String description() {
        return equip.description()+" 红宝石";
    }
}
