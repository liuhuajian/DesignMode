package com.smartx.tank.mvpapplicationtest.state.action;

/**
 * Created by messi on 17/6/21.
 */

import com.smartx.tank.mvpapplicationtest.Logger;
import com.smartx.tank.mvpapplicationtest.state.State;
import com.smartx.tank.mvpapplicationtest.state.VenderMachine;

/**
 * 没钱的状态下动作
 */
public class NoMoneyState implements State {

    private VenderMachine venderMachine;

    public NoMoneyState(VenderMachine venderMachine){
        this.venderMachine = venderMachine;
    }

    @Override
    public void insertMoney() {
        Logger.d("投币成功...");
        venderMachine.setState(venderMachine.getHasMoneyState());
    }

    @Override
    public void backMoney() {
        Logger.d("你是个穷光蛋...");
    }

    @Override
    public void turnCrank() {
        Logger.d("没钱，转你妹啊...");
    }

    @Override
    public void dispense() {
        Logger.d("没钱，给我滚蛋...");
        throw new IllegalStateException("非法状态");
    }
}
