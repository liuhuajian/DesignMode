package com.smartx.tank.mvpapplicationtest.state;

/**
 * Created by messi on 17/6/21.
 */

public interface State {
    void insertMoney();

    void backMoney();

    void turnCrank();

    void dispense();
}
