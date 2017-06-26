package com.smartx.tank.mvpapplicationtest.command;

/**
 * Created by messi on 17/6/26.
 */

public class DoorCloseCommand implements Command {

    private Door door;

    public DoorCloseCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }
}
