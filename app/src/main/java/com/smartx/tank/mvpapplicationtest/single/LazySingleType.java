package com.smartx.tank.mvpapplicationtest.single;

/**
 * 懒汉式
 * Created by messi on 17/6/26.
 */

public class LazySingleType {
    private static LazySingleType lazySingleType = null;
    private LazySingleType(){}

    public static LazySingleType getInstance(){
        if (lazySingleType ==null){
            synchronized (LazySingleType.class){
                if (lazySingleType ==null){
                    lazySingleType = new LazySingleType();
                }
            }
        }
        return lazySingleType;
    }

//    public static synchronized LazySingleType getInstance(){
//        if (lazySingleType ==null)
//            lazySingleType = new LazySingleType();
//        return lazySingleType;
//    }
}
