package com.smartx.tank.mvpapplicationtest.factory.simplefactory;

import com.smartx.tank.mvpapplicationtest.factory.BeiJingRouJiaMo;
import com.smartx.tank.mvpapplicationtest.factory.JiangSuRouJiaMo;
import com.smartx.tank.mvpapplicationtest.factory.RouJiaMo;
import com.smartx.tank.mvpapplicationtest.factory.ShanZhaiRouJiaMo;
import com.smartx.tank.mvpapplicationtest.factory.TWRouJiaMo;

/**
 * Created by messi on 17/6/23.
 */

public class SimpleRouJiaMoFactory {
    public static RouJiaMo createRouJiaMo(String type){
        RouJiaMo rouJiaMo = null;
        if (type.equals("jiangsu")){
            rouJiaMo = new JiangSuRouJiaMo();
        }else if (type.equals("taiwan")){
            rouJiaMo = new TWRouJiaMo();
        }else if (type.equals("beijing")){
            rouJiaMo = new BeiJingRouJiaMo();
        }else {
            rouJiaMo = new ShanZhaiRouJiaMo();
        }
        return rouJiaMo;
    }
}
