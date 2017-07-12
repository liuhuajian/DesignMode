package com.smartx.tank.mvpapplicationtest.command.type1;

/**
 * Created by messi on 17/6/26.
 */

public class ComputerOpenCommand implements Command {

    private Computer computer;

    public ComputerOpenCommand(Computer computer){
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.open();
    }
}
