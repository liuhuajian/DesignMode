package com.smartx.tank.mvpapplicationtest;

/**
 * Created by messi on 17/6/21.
 */

public interface MessContract {
    interface TestView{
        void showLoading(String data);
        void completeLoad(String data);
    }
    interface TestPresent{
        void saveData(String data);
        void getData(String data);
    }
}
