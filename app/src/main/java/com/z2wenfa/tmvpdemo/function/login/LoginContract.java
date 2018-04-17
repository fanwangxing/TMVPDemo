package com.z2wenfa.tmvpdemo.function.login;


import com.z2wenfa.tmvpdemo.base.BaseModel;
import com.z2wenfa.tmvpdemo.base.BasePresenter;
import com.z2wenfa.tmvpdemo.base.BaseView;

/**
 * Created by z2wenfa on 2016/9/1.
 */
public interface LoginContract {

    interface View extends BaseView {
        void loginSuccess();

        void showMsg(String msg);
    }

    interface Model extends BaseModel {
        boolean login(String username, String password, String passcode);
    }

    abstract class Presenter extends BasePresenter<Model, View> {

        @Override
        public void onStart() {

        }

        public abstract void login(String username, String password, String passcode);
    }
}