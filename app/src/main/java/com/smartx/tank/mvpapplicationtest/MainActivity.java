package com.smartx.tank.mvpapplicationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.smartx.tank.mvpapplicationtest.strategy.AttackExpend;
import com.smartx.tank.mvpapplicationtest.strategy.base.BaseRole;
import com.smartx.tank.mvpapplicationtest.strategy.DefendZega;
import com.smartx.tank.mvpapplicationtest.strategy.RoleZega;
import com.smartx.tank.mvpapplicationtest.strategy.SpeedZega;

public class MainActivity extends AppCompatActivity implements MessContract.TestView{

    private TestPresenter testPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testPresenter = new TestPresenter(this);
    }

    @Override
    public void showLoading(String data) {
        Logger.d(data);
    }

    @Override
    public void completeLoad(String data) {
        Logger.d(data);
    }

    public void btnTest1(View view) {
        testPresenter.saveData("liuhuajian zai ci");
    }

    public void btnTest2(View view) {

        BaseRole roleZega = new RoleZega("liuhuajian");
        roleZega.setAttackBehavior(new AttackExpend())
                .setDefendBehavior(new DefendZega())
                .setSpeedBehavior(new SpeedZega());
        roleZega.displayAttack();
        roleZega.displayDefend();
        roleZega.displaySpeed();

//        testPresenter.getData("wo ri ni da ye");

//        VenderMachine machine = new VenderMachine(10);
//        machine.insertMoney();
//        machine.backMoney();
//
//        Logger.d("----我要中奖----");
//
//        machine.insertMoney();
//        machine.turnCrank();
//        machine.insertMoney();
//        machine.turnCrank();
//        machine.insertMoney();
//        machine.turnCrank();
//        machine.insertMoney();
//        machine.turnCrank();
//        machine.insertMoney();
//        machine.turnCrank();
//        machine.insertMoney();
//        machine.turnCrank();
//        machine.insertMoney();
//        machine.turnCrank();
//
//        Logger.d("-------压力测试------");
//
//        machine.insertMoney();
//        machine.backMoney();
//        machine.backMoney();
//        machine.turnCrank();// 无效操作
//        machine.turnCrank();// 无效操作
//        machine.backMoney();
    }
}
