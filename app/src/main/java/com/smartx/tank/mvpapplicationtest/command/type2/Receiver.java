package com.smartx.tank.mvpapplicationtest.command.type2;

import com.smartx.tank.mvpapplicationtest.Logger;

/**
 * Created by messi on 17/7/12.
 */

public class Receiver {
    public void action(){
        Logger.d("执行命令。。。");
    }

    public void unAction(){
        Logger.d("取消执行命令。。。");
    }
}
