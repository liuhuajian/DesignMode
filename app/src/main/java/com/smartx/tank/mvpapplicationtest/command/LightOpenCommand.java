package com.smartx.tank.mvpapplicationtest.command;

/**
 * Created by messi on 17/6/26.
 */

public class LightOpenCommand implements Command {

    private Light light;

    public LightOpenCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.open();
    }
}
