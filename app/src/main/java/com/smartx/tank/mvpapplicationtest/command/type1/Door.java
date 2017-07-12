package com.smartx.tank.mvpapplicationtest.command.type1;

import com.smartx.tank.mvpapplicationtest.Logger;

/**
 * Created by messi on 17/6/26.
 */

public class Door {
    public void open(){
        Logger.d("开门");
    }

    public void close(){
        Logger.d("关门");
    }
}
