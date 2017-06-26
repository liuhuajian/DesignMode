package com.smartx.tank.mvpapplicationtest.single;

/**
 * 饿汉式
 * Created by messi on 17/6/26.
 */

public class HungrySingleType {
    private static HungrySingleType hungrySingleType = new HungrySingleType();
    public static HungrySingleType getInstance(){
        return hungrySingleType;
    }
}
