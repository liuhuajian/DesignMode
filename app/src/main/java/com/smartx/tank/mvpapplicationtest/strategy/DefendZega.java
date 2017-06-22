package com.smartx.tank.mvpapplicationtest.strategy;

import com.smartx.tank.mvpapplicationtest.Logger;
import com.smartx.tank.mvpapplicationtest.strategy.base.DefendBehavior;

/**
 * Created by messi on 17/6/22.
 */

public class DefendZega implements DefendBehavior {
    @Override
    public void defend() {
        Logger.d("主动技能：无敌防御");
    }
}
