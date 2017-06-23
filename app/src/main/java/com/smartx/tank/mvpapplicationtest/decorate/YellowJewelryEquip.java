package com.smartx.tank.mvpapplicationtest.decorate;

/**
 * Created by messi on 17/6/23.
 */

public class YellowJewelryEquip implements IJewelryEquip {

    private IEquip equip;

    public YellowJewelryEquip(IEquip equip){
        this.equip = equip;
    }

    @Override
    public int calculateAttack() {
        return equip.calculateAttack()+10;
    }

    @Override
    public String description() {
        return equip.description()+" 黄宝石";
    }
}
