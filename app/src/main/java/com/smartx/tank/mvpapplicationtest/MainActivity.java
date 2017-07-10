package com.smartx.tank.mvpapplicationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.smartx.tank.mvpapplicationtest.adapter.Mobile;
import com.smartx.tank.mvpapplicationtest.adapter.PowerAdapter;
import com.smartx.tank.mvpapplicationtest.adapter.V200Power;
import com.smartx.tank.mvpapplicationtest.adapter.V5Power;
import com.smartx.tank.mvpapplicationtest.appearance.OneKeyControl;
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
import com.smartx.tank.mvpapplicationtest.mediator.CollectionA;
import com.smartx.tank.mvpapplicationtest.mediator.CollectionB;
import com.smartx.tank.mvpapplicationtest.mediator.Mediator;
import com.smartx.tank.mvpapplicationtest.observer.injava.ObserverInJava;
import com.smartx.tank.mvpapplicationtest.observer.injava.SubjectAInJava;
import com.smartx.tank.mvpapplicationtest.observer.injava.SubjectBInJava;
import com.smartx.tank.mvpapplicationtest.propotype.InstancePropo;
import com.smartx.tank.mvpapplicationtest.single.EnumSingleType;
import com.smartx.tank.mvpapplicationtest.single.HoldSingleType;
import com.smartx.tank.mvpapplicationtest.single.HungrySingleType;
import com.smartx.tank.mvpapplicationtest.single.LazySingleType;
import com.smartx.tank.mvpapplicationtest.template.HRWorker;
import com.smartx.tank.mvpapplicationtest.template.ITWorker;
import com.smartx.tank.mvpapplicationtest.template.ProjectManWorker;
import com.smartx.tank.mvpapplicationtest.template.Worker;

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

        //中介者模式
        CollectionA collectionA = new CollectionA();
        CollectionB collectionB = new CollectionB();
        Mediator mediator = new Mediator(collectionA ,collectionB);
        collectionA.setNumber(100,mediator);

        Logger.d("CollectionA:"+collectionA.getNumber());
        Logger.d("CollectionB:"+collectionB.getNumber());
        collectionB.setNumber(200,mediator);
        Logger.d("CollectionA:"+collectionA.getNumber());
        Logger.d("CollectionB:"+collectionB.getNumber());

        //原型模式
//        InstancePropo instancePropo = new InstancePropo();
//
//        for (int i=0;i<10;i++){
//           InstancePropo instancePropo1 = (InstancePropo) instancePropo.clone();
//            instancePropo1.show();
//        }

        //模板方法模式
//        Worker ITWorker = new ITWorker("liuhuajian");
//        ITWorker.workOneDay();
//        Worker hrWorker = new HRWorker("小婊砸");
//        hrWorker.workOneDay();
//        Worker proManWorker = new ProjectManWorker("tangor");
//        proManWorker.workOneDay();


        //外观模式
//        com.smartx.tank.mvpapplicationtest.appearance.Computer computer = new com.smartx.tank.mvpapplicationtest.appearance.Computer();
//        com.smartx.tank.mvpapplicationtest.appearance.Light light = new com.smartx.tank.mvpapplicationtest.appearance.Light();
//        com.smartx.tank.mvpapplicationtest.appearance.Door door = new com.smartx.tank.mvpapplicationtest.appearance.Door();
//        OneKeyControl oneKeyControl = new OneKeyControl(computer,door,light);
//        oneKeyControl.openAll();
//        oneKeyControl.closeAll();


        //适配器模式
//        Mobile mobile = new Mobile();
//        V5Power v5Power = new PowerAdapter(new V200Power());
//        mobile.inputPower(v5Power);


        //命令模式
//        Door door = new Door();
//        Light light = new Light();
//        Computer computer = new Computer();
//
//        ControlPanel controlPanel = new ControlPanel();
//        controlPanel.setCommand(0,new DoorOpenCommand(door));
//        controlPanel.setCommand(1,new DoorCloseCommand(door));
//        controlPanel.setCommand(2,new ComputerOpenCommand(computer));
//        controlPanel.setCommand(3,new ComputerCloseCommand(computer));
//        controlPanel.setCommand(4,new LightOpenCommand(light));
//        controlPanel.setCommand(5,new LightCloseCommand(light));
//
//        Random random = new Random();
//        int index = random.nextInt(6);
//        controlPanel.keyControl(index);

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
