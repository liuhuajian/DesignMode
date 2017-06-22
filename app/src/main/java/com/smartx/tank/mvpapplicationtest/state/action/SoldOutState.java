package com.smartx.tank.mvpapplicationtest.state.action;

/**
 * Created by messi on 17/6/21.
 */

import com.smartx.tank.mvpapplicationtest.Logger;
import com.smartx.tank.mvpapplicationtest.state.State;
import com.smartx.tank.mvpapplicationtest.state.VenderMachine;

/**
 * 售完后的动作
 */
public class SoldOutState implements State {
    private VenderMachine venderMachine;

    public SoldOutState(VenderMachine venderMachine){
        this.venderMachine = venderMachine;
    }
    @Override
    public void insertMoney() {
        Logger.d("投币失败，商品售罄");
    }

    @Override
    public void backMoney() {
        Logger.d("没投币还想退钱？");
    }

    @Override
    public void turnCrank() {
        Logger.d("没货了就别瞎几把转手柄了");
    }

    @Override
    public void dispense() {
        new IllegalStateException("非法状态");
    }
}
