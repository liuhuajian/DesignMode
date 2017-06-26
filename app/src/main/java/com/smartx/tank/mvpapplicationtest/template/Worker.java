package com.smartx.tank.mvpapplicationtest.template;

import com.smartx.tank.mvpapplicationtest.Logger;

/**
 * Created by messi on 17/6/26.
 */

public abstract class Worker {
    protected String name;
    public Worker(String name){
        this.name = name;
    }

    public void workOneDay(){
        entryCompany();
        openComputer();
        work();
        closeComputer();
        leaveCompany();
    }

    private void leaveCompany() {
        Logger.d(name+"离开公司");
    }

    private void closeComputer() {
        Logger.d(name+"关闭电脑");
    }

    protected abstract void work();

    private void openComputer() {
        Logger.d(name+"打开电脑");
    }

    protected void entryCompany(){
        Logger.d(name+"进入公司");
    }

}
