package com.smartx.tank.mvpapplicationtest.command;

/**
 * Created by messi on 17/6/26.
 */

public class LightCloseCommand implements Command {

    private Light light;

    public LightCloseCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.close();
    }
}
