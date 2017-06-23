package com.smartx.tank.mvpapplicationtest.factory.abstractfactory;

import com.smartx.tank.mvpapplicationtest.factory.JiangSuRouJiaMo;
import com.smartx.tank.mvpapplicationtest.factory.RouJiaMo;

/**
 * Created by messi on 17/6/23.
 */

public class JiangSuRouJiaMoFactory implements IRouJiaMoFactory {
    @Override
    public RouJiaMo createRouJiaMo() {
        RouJiaMo rouJiaMo = new JiangSuRouJiaMo();
        rouJiaMo.prepare();
        rouJiaMo.pack();
        rouJiaMo.fire();
        return rouJiaMo;
    }
}
