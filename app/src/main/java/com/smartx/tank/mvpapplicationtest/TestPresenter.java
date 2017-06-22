package com.smartx.tank.mvpapplicationtest;

/**
 * Created by messi on 17/6/21.
 */

public class TestPresenter implements MessContract.TestPresent {

    private MessContract.TestView myTestView;
    public TestPresenter(MessContract.TestView view){
        myTestView = view;
    }

    @Override
    public void saveData(String data) {
        String changeData = TestModeAdd.changeName(data);
        myTestView.completeLoad(changeData);
    }

    @Override
    public void getData(String data) {
        myTestView.showLoading(data);
    }
}
