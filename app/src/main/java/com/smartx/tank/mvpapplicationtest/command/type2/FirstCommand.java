package com.smartx.tank.mvpapplicationtest.command.type2;

/**
 * Created by messi on 17/7/12.
 */

public class FirstCommand implements Command {
    private Receiver receiver;
    public FirstCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public void cancel() {
        receiver.unAction();
    }
}
