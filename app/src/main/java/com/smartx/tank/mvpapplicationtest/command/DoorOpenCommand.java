package com.smartx.tank.mvpapplicationtest.command;

/**
 * Created by messi on 17/6/26.
 */

public class DoorOpenCommand implements Command {

    private Door door;

    public DoorOpenCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
