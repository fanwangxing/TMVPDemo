package com.z2wenfa.tmvpdemo.function.login;

/**
* Created by TMVPHelper on 2016/10/20
*/
public class LoginPresenter extends LoginContract.Presenter{

    @Override
    public void login(String username, String password, String passcode) {
        if(mModel.login(username,password,passcode)){
            mView.showMsg("登陆成功");
            mView.loginSuccess();
        }else{
            mView.showMsg("登陆失败");
        }
    }
}