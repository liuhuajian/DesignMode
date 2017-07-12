package com.smartx.tank.mvpapplicationtest.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by messi on 17/7/11.
 */

public class ObjectStruture {
    public static List<Element> getList(){
        List<Element> elements = new ArrayList<>();
        for (int i=0;i<10;i++){
            int random = new Random().nextInt(10);
            if (random>5){
                elements.add(new ElementOne());
            }else {
                elements.add(new ElementTwo());
            }
        }
        return elements;
    }
}
