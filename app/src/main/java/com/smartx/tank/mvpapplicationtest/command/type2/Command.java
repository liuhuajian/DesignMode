package com.smartx.tank.mvpapplicationtest.command.type2;

/**
 * Created by messi on 17/7/12.
 */

public interface Command {
    void execute(); //执行命令
    void cancel();  //取消执行
}
