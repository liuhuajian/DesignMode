package com.smartx.tank.mvpapplicationtest.command;

/**
 * Created by messi on 17/6/26.
 */

public class ControlPanel {
    public static final int CONTROL_SIZE = 9;
    private Command[] commands;

    public ControlPanel(){
        commands = new Command[CONTROL_SIZE];
        for (int i=0;i<CONTROL_SIZE;i++){
            commands[i] = new NoCommand();
        }
    }

    /**
     * 设置每个按钮对应的命令
     * @param index
     * @param command
     */
    public void setCommand(int index , Command command){
        commands[index] = command;
    }

    /**
     * 模拟点击事件
     * @param index
     */
    public void keyControl(int index){
        commands[index].execute();
    }
}
