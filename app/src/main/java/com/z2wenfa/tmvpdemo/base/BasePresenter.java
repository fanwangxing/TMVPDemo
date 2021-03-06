package com.z2wenfa.tmvpdemo.base;

import android.content.Context;

import com.z2wenfa.tmvpdemo.util.rxbus.RxManager;


/**
 * T-MVP Presenter基类
 * Created by baixiaokang on 16/4/22.
 */
public abstract class BasePresenter<M, T> {
    public Context context;
    public M mModel;
    public T mView;
    public RxManager mRxManager = new RxManager();

    public void setVM(T v, M m) {
        this.mView = v;
        this.mModel = m;
        this.onStart();

    }

    public abstract void onStart();

    public void onDestroy() {
        mRxManager.clear();
    }
}
