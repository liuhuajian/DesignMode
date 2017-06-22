package com.smartx.tank.mvpapplicationtest.state.action;

/**
 * Created by messi on 17/6/21.
 */

import com.smartx.tank.mvpapplicationtest.Logger;
import com.smartx.tank.mvpapplicationtest.state.State;
import com.smartx.tank.mvpapplicationtest.state.VenderMachine;

/**
 * 出售中的动作
 */
public class SoldingState implements State {
    private VenderMachine venderMachine;

    public SoldingState(VenderMachine venderMachine){
        this.venderMachine = venderMachine;
    }
    @Override
    public void insertMoney() {
        Logger.d("正在出货，别重复投币");
    }

    @Override
    public void backMoney() {
        Logger.d("正在出货，无法退币");
    }

    @Override
    public void turnCrank() {
        Logger.d("正在出货，请勿重复转动手柄");
    }

    @Override
    public void dispense() {
        venderMachine.dispense();
        if (venderMachine.getCount()<=0){
            Logger.d("卖光啦，滚蛋");
            venderMachine.setState(venderMachine.getSoldOutState());
        }else {
            venderMachine.setState(venderMachine.getNoMoneyState());
        }
    }
}
