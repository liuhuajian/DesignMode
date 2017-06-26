package com.smartx.tank.mvpapplicationtest.adapter;

import com.smartx.tank.mvpapplicationtest.Logger;

/**
 * Created by messi on 17/6/26.
 */

public class PowerAdapter implements V5Power {

    private V200Power v200Power;

    public PowerAdapter(V200Power v200Power){
        this.v200Power = v200Power;
    }

    @Override
    public int poviderV5Power() {

        int v200Power = this.v200Power.providerV200Power();
        Logger.d("转换为5v电压");
        return 5;
    }
}
