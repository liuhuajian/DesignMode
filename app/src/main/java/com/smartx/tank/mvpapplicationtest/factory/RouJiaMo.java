package com.smartx.tank.mvpapplicationtest.factory;

import com.smartx.tank.mvpapplicationtest.Logger;

/**
 * Created by messi on 17/6/23.
 */

public abstract class RouJiaMo {
    protected String name;

    public void prepare(){
        Logger.d(name+"---->剁肉--完成准备工作");
    }

    public void pack(){
        Logger.d(name+"---->专用袋--包装");
    }

    public void fire(){
        Logger.d(name+"---->烘烤机--烘烤");
    }
}
