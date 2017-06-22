package com.smartx.tank.mvpapplicationtest.state;

import com.smartx.tank.mvpapplicationtest.state.action.HasMoneyState;
import com.smartx.tank.mvpapplicationtest.state.action.NoMoneyState;
import com.smartx.tank.mvpapplicationtest.state.action.SoldOutState;
import com.smartx.tank.mvpapplicationtest.state.action.SoldingState;
import com.smartx.tank.mvpapplicationtest.state.action.WinState;

/**
 * Created by messi on 17/6/21.
 */

public class VenderMachine {

    private State currentState;
    private NoMoneyState noMoneyState;
    private HasMoneyState hasMoneyState;
    private SoldingState soldingState;
    private SoldOutState soldOutState;
    private WinState winState;
    private int count;

    public VenderMachine(int count){
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldingState = new SoldingState(this);
        soldOutState = new SoldOutState(this);
        winState = new WinState(this);
        this.count = count;
        if (count >0){
            currentState = noMoneyState;
        }
    }

    public void insertMoney(){
        currentState.insertMoney();
    }

    public void backMoney(){
        currentState.backMoney();
    }

    public void turnCrank(){
        currentState.turnCrank();
        if (currentState ==soldingState || currentState ==winState ){
            currentState.dispense();
        }
    }

    public void dispense(){
        count--;
    }

    public void setState(State state){
        currentState = state;
    }
    
    public State getNoMoneyState(){
        return noMoneyState;
    }

    public State getHasMoneyState(){
        return hasMoneyState;
    }

    public State getSoldingState(){
        return soldingState;
    }

    public State getSoldOutState(){
        return soldOutState;
    }

    public State getWinerState(){
        return winState;
    }

    public int getCount(){
        return count;
    }
}
