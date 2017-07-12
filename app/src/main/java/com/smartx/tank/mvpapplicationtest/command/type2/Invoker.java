package com.smartx.tank.mvpapplicationtest.command.type2;

/**
 * Created by messi on 17/7/12.
 */

public class Invoker {
    private Command command;
    public Invoker(Command command){
        this.command = command;
    }

    public void execute(){
        command.execute();
    }

    public void cancel(){
        command.cancel();
    }
}
