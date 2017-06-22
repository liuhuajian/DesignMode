package com.smartx.tank.mvpapplicationtest;

import android.text.TextUtils;

/**
 * Created by messi on 17/6/21.
 */

public class TestModeAdd {
    public static String changeName(String name){
        if (TextUtils.isEmpty(name))
            return null;
        return name.toUpperCase();
    }
}
