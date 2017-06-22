package com.smartx.tank.mvpapplicationtest.state.action;

/**
 * Created by messi on 17/6/21.
 */

import com.smartx.tank.mvpapplicationtest.Logger;
import com.smartx.tank.mvpapplicationtest.state.State;
import com.smartx.tank.mvpapplicationtest.state.VenderMachine;

/**
 * 中奖后的动作
 */
public class WinState implements State {
    private VenderMachine venderMachine;

    public WinState(VenderMachine venderMachine){
        this.venderMachine = venderMachine;
    }
    @Override
    public void insertMoney() {
        throw new IllegalStateException("非法状态");
    }

    @Override
    public void backMoney() {
        throw new IllegalStateException("非法状态");
    }

    @Override
    public void turnCrank() {
        throw new IllegalStateException("非法状态");
    }

    @Override
    public void dispense() {
        Logger.d("你中奖了，恭喜你将得到两件商品");
        venderMachine.dispense();
        if (venderMachine.getCount() <=0){
            Logger.d("商品卖完了...");
            venderMachine.setState(venderMachine.getSoldOutState());
        }else {
            venderMachine.dispense();
            if (venderMachine.getCount() <=0){
                Logger.d("商品卖完了...");
                venderMachine.setState(venderMachine.getSoldOutState());
            }else {
                venderMachine.setState(venderMachine.getNoMoneyState());
            }
        }
    }
}
