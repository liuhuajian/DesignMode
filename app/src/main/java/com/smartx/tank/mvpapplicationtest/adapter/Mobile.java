package com.smartx.tank.mvpapplicationtest.adapter;

import com.smartx.tank.mvpapplicationtest.Logger;

/**
 * Created by messi on 17/6/26.
 */

public class Mobile {
    public void inputPower(V5Power power){
        int powerV5 = power.poviderV5Power();
        Logger.d("我需要5V电压，现在是："+powerV5+"V");
    }
}
