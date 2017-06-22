package com.smartx.tank.mvpapplicationtest.strategy;

import com.smartx.tank.mvpapplicationtest.Logger;
import com.smartx.tank.mvpapplicationtest.strategy.base.AttackBehavior;

/**
 * Created by messi on 17/6/22.
 */

public class AttackZega implements AttackBehavior {
    @Override
    public void attack() {
        Logger.d("主动技能：未知雷暴");
    }
}
