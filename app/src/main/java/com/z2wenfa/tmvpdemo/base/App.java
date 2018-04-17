package com.z2wenfa.tmvpdemo.base;

import android.app.Application;
import android.content.Context;

import com.z2wenfa.tmvpdemo.util.JumpUtil;

/**
 * Created by z2wenfa on 2016/10/20.
 */

public class App extends Application {
    private static App app;

    public static Context getAppContext() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        JumpUtil.init(app);
    }
}
