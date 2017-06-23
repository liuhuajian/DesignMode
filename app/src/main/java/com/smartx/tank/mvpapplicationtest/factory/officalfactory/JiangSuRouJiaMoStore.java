package com.smartx.tank.mvpapplicationtest.factory.officalfactory;

import com.smartx.tank.mvpapplicationtest.factory.BeiJingRouJiaMo;
import com.smartx.tank.mvpapplicationtest.factory.JiangSuRouJiaMo;
import com.smartx.tank.mvpapplicationtest.factory.RouJiaMo;
import com.smartx.tank.mvpapplicationtest.factory.ShanZhaiRouJiaMo;
import com.smartx.tank.mvpapplicationtest.factory.TWRouJiaMo;

/**
 * Created by messi on 17/6/23.
 */

public class JiangSuRouJiaMoStore extends RouJiaMoStore {
    @Override
    protected RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;
        if (type.equals("la")){
            rouJiaMo = new TWRouJiaMo();
        }else if (type.equals("tian")){
            rouJiaMo = new JiangSuRouJiaMo();
        }else if (type.equals("suan")){
            rouJiaMo = new BeiJingRouJiaMo();
        }else {
            rouJiaMo = new ShanZhaiRouJiaMo();
        }
        return rouJiaMo;
    }
}
