package com.smartx.tank.mvpapplicationtest.appearance;

/**
 * 外观模式
 * Created by messi on 17/6/26.
 */

public class OneKeyControl {

    private Computer computer;
    private Door door;
    private Light light;

    public OneKeyControl(Computer computer, Door door, Light light){
        this.computer  = computer;
        this.door = door;
        this.light = light;
    }

    public void openAll(){
        computer.open();
        door.open();
        light.open();
    }

    public void closeAll(){
        computer.close();
        door.close();
        light.close();
    }
}
