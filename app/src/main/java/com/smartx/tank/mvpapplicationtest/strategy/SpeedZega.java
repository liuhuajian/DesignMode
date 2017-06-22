package com.smartx.tank.mvpapplicationtest.strategy;

import com.smartx.tank.mvpapplicationtest.Logger;
import com.smartx.tank.mvpapplicationtest.strategy.base.SpeedBehavior;

/**
 * Created by messi on 17/6/22.
 */

public class SpeedZega implements SpeedBehavior {
    @Override
    public void speed() {
        Logger.d("主动技能：急速");
    }
}
