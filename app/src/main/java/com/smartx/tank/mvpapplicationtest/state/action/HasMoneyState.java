package com.smartx.tank.mvpapplicationtest.state.action;

/**
 * Created by messi on 17/6/21.
 */

import com.smartx.tank.mvpapplicationtest.Logger;
import com.smartx.tank.mvpapplicationtest.state.State;
import com.smartx.tank.mvpapplicationtest.state.VenderMachine;

import java.util.Random;

/**
 * 有钱状态下的动作
 */
public class HasMoneyState implements State {

    private VenderMachine venderMachine;
    public HasMoneyState(VenderMachine venderMachine){
        this.venderMachine = venderMachine;
    }
    @Override
    public void insertMoney() {
        Logger.d("已经投过币了，你个傻逼...");
    }

    @Override
    public void backMoney() {
        Logger.d("退币成功...");
        venderMachine.setState(venderMachine.getNoMoneyState());
    }

    @Override
    public void turnCrank() {
        int winner = new Random().nextInt(10);
        if (winner ==0 &&venderMachine.getCount()>1){
            venderMachine.setState(venderMachine.getWinerState());
        }else {
            venderMachine.setState(venderMachine.getSoldingState());
        }
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("非法状态...");
    }
}
