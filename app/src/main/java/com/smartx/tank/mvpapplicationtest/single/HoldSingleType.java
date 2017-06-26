package com.smartx.tank.mvpapplicationtest.single;

/**
 * 使用持有类方式
 * Created by messi on 17/6/26.
 */

public class HoldSingleType {
    private static final class InstanceHold{
        private static HoldSingleType holdSingleType = new HoldSingleType();
    }

    public static HoldSingleType getInstance(){
        return InstanceHold.holdSingleType;
    }
}
