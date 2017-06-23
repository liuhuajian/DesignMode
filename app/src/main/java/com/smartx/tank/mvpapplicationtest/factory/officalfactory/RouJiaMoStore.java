package com.smartx.tank.mvpapplicationtest.factory.officalfactory;

import com.smartx.tank.mvpapplicationtest.factory.RouJiaMo;

/**
 * Created by messi on 17/6/23.
 */

public abstract class RouJiaMoStore {

    protected abstract RouJiaMo createRouJiaMo(String type);

    public RouJiaMo sellRouJiaMo(String type){
        RouJiaMo rouJiaMo = createRouJiaMo(type);
        rouJiaMo.prepare();
        rouJiaMo.pack();
        rouJiaMo.fire();
        return rouJiaMo;
    }
}
