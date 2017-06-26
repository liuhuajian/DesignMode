package com.smartx.tank.mvpapplicationtest.template;

import com.smartx.tank.mvpapplicationtest.Logger;

/**
 * Created by messi on 17/6/26.
 */

public class HRWorker extends Worker {

    public HRWorker(String name){
        super(name);
    }

    @Override
    protected void work() {
        Logger.d(name+"筛选简历");
    }
}
