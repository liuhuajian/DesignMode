package com.smartx.tank.mvpapplicationtest.decorate;

/**
 * 装饰模式
 * Created by messi on 17/6/23.
 */

public interface IEquip {
    /**
     * 计算攻击力
     * @return
     */
    int calculateAttack();

    /**
     * 装备的描述
     * @return
     */
    String description();
}
