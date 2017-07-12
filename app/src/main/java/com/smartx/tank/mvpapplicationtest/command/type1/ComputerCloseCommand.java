package com.smartx.tank.mvpapplicationtest.command.type1;

/**
 * Created by messi on 17/6/26.
 */

public class ComputerCloseCommand implements Command {

    private Computer computer;

    public ComputerCloseCommand(Computer computer){
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.close();
    }
}
