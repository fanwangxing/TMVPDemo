package com.z2wenfa.tmvpdemo.function.login;

/**
 * Created by TMVPHelper on 2016/10/20
 */
public class LoginModel implements LoginContract.Model {

    @Override
    public boolean login(String username, String password, String passcode) {
        if ("z2wenfa".equals(username)) {
            return true;
        }
        return false;
    }
}