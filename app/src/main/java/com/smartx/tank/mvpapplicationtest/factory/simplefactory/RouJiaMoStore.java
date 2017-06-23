package com.smartx.tank.mvpapplicationtest.factory.simplefactory;

import com.smartx.tank.mvpapplicationtest.factory.RouJiaMo;

/**
 * Created by messi on 17/6/23.
 */

public class RouJiaMoStore {
    public RouJiaMoStore(){

    }

    /**
     * 根据传入的类型，供应不同的肉夹馍
     * @param type
     */
    public void sellRouJiaMo(String type){
        RouJiaMo rouJiaMo = SimpleRouJiaMoFactory.createRouJiaMo(type);
        rouJiaMo.prepare();
        rouJiaMo.pack();
        rouJiaMo.fire();
    }
}
