package com.smartx.tank.mvpapplicationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.smartx.tank.mvpapplicationtest.command.Computer;
import com.smartx.tank.mvpapplicationtest.command.ComputerCloseCommand;
import com.smartx.tank.mvpapplicationtest.command.ComputerOpenCommand;
import com.smartx.tank.mvpapplicationtest.command.ControlPanel;
import com.smartx.tank.mvpapplicationtest.command.Door;
import com.smartx.tank.mvpapplicationtest.command.DoorCloseCommand;
import com.smartx.tank.mvpapplicationtest.command.DoorOpenCommand;
import com.smartx.tank.mvpapplicationtest.command.Light;
import com.smartx.tank.mvpapplicationtest.command.LightCloseCommand;
import com.smartx.tank.mvpapplicationtest.command.LightOpenCommand;
import com.smartx.tank.mvpapplicationtest.decorate.ArmEquip;
import com.smartx.tank.mvpapplicationtest.decorate.BlueJewelryEquip;
import com.smartx.tank.mvpapplicationtest.decorate.IEquip;
import com.smartx.tank.mvpapplicationtest.decorate.RedJewelryEquip;
import com.smartx.tank.mvpapplicationtest.decorate.ShoeEquip;
import com.smartx.tank.mvpapplicationtest.decorate.YellowJewelryEquip;
import com.smartx.tank.mvpapplicationtest.factory.abstractfactory.JiangSuRouJiaMoFactory;
import com.smartx.tank.mvpapplicationtest.factory.officalfactory.JiangSuRouJiaMoStore;
import com.smartx.tank.mvpapplicationtest.factory.simplefactory.RouJiaMoStore;
import com.smartx.tank.mvpapplicationtest.observer.injava.ObserverInJava;
import com.smartx.tank.mvpapplicationtest.observer.injava.SubjectAInJava;
import com.smartx.tank.mvpapplicationtest.observer.injava.SubjectBInJava;
import com.smartx.tank.mvpapplicationtest.single.EnumSingleType;
import com.smartx.tank.mvpapplicationtest.single.HoldSingleType;
import com.smartx.tank.mvpapplicationtest.single.HungrySingleType;
import com.smartx.tank.mvpapplicationtest.single.LazySingleType;

import java.util.Random;

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

        //命令模式
        Door door = new Door();
        Light light = new Light();
        Computer computer = new Computer();

        ControlPanel controlPanel = new ControlPanel();
        controlPanel.setCommand(0,new DoorOpenCommand(door));
        controlPanel.setCommand(1,new DoorCloseCommand(door));
        controlPanel.setCommand(2,new ComputerOpenCommand(computer));
        controlPanel.setCommand(3,new ComputerCloseCommand(computer));
        controlPanel.setCommand(4,new LightOpenCommand(light));
        controlPanel.setCommand(5,new LightCloseCommand(light));

        Random random = new Random();
        int index = random.nextInt(6);
        controlPanel.keyControl(index);

        //单例模式
//        LazySingleType instance = LazySingleType.getInstance();
//        HungrySingleType instance1 = HungrySingleType.getInstance();
//        EnumSingleType instance2 = EnumSingleType.INSTANCE;
//        HoldSingleType instance3 = HoldSingleType.getInstance();

        //工厂模式
//        new JiangSuRouJiaMoFactory().createRouJiaMo();
//        JiangSuRouJiaMoStore jiangSuRouJiaMoStore = new JiangSuRouJiaMoStore();
//        jiangSuRouJiaMoStore.sellRouJiaMo("la");

//        RouJiaMoStore rouJiaMoStore = new RouJiaMoStore();
//        rouJiaMoStore.sellRouJiaMo("jiangsu");

        //装饰模式
//        //镶嵌一颗红宝石，一颗蓝宝石，一颗黄宝石的武器
//        IEquip equip = new RedJewelryEquip(new BlueJewelryEquip(new YellowJewelryEquip(new ArmEquip())));
//        String description = equip.description();
//        int attack = equip.calculateAttack();
//        Logger.d("攻击力-->"+attack);
//        Logger.d("描述-->"+description);

        //观察者模式
//        SubjectAInJava subjectAInJava = new SubjectAInJava();
//        SubjectBInJava subjectBInJava = new SubjectBInJava();
//
//        ObserverInJava observerInJava = new ObserverInJava(subjectBInJava);
//        subjectBInJava.sendMsg("我最帅了哈哈哈");

//        HuaLi huaLi = new HuaLi();
//        ObserverA observerA = new ObserverA(huaLi);
//        ObserverB observerB = new ObserverB(huaLi);
//
//        huaLi.sendMsg("你是个傻逼。。。。");

        //策略模式
//        BaseRole roleZega = new RoleZega("liuhuajian");
//        roleZega.setAttackBehavior(new AttackExpend())
//                .setDefendBehavior(new DefendZega())
//                .setSpeedBehavior(new SpeedZega());
//        roleZega.displayAttack();
//        roleZega.displayDefend();
//        roleZega.displaySpeed();

//        testPresenter.getData("wo ri ni da ye");

        //状态模式
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
