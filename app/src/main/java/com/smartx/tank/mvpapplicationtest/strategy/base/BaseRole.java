package com.smartx.tank.mvpapplicationtest.strategy.base;

import com.smartx.tank.mvpapplicationtest.Logger;

/**
 * 策略模式
 * Created by messi on 17/6/22.
 */

public abstract class BaseRole {
    protected AttackBehavior attackBehavior;
    protected DefendBehavior defendBehavior;
    protected SpeedBehavior speedBehavior;
    protected String name;

    public BaseRole setAttackBehavior(AttackBehavior attackBehavior){
        this.attackBehavior = attackBehavior;
        return this;
    }

    public BaseRole setDefendBehavior(DefendBehavior defendBehavior){
        this.defendBehavior = defendBehavior;
        return this;
    }

    public BaseRole setSpeedBehavior(SpeedBehavior speedBehavior){
        this.speedBehavior = speedBehavior;
        return this;
    }

    public void displayAttack(){
        attackBehavior.attack();
    }

    public void displayDefend(){
        defendBehavior.defend();
    }

    public void displaySpeed(){
        speedBehavior.speed();
    }
}
