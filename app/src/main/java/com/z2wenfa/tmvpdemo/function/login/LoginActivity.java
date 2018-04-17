package com.z2wenfa.tmvpdemo.function.login;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.z2wenfa.tmvpdemo.MainActivity;
import com.z2wenfa.tmvpdemo.R;
import com.z2wenfa.tmvpdemo.base.BaseActivity;
import com.z2wenfa.tmvpdemo.util.JumpUtil;

/**
 * Created by z2wenfa on 2016/10/20.
 */

public class LoginActivity extends BaseActivity<LoginPresenter, LoginModel> implements LoginContract.View {
    private EditText username;
    private EditText password;
    private Button login;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.login(username.getText().toString(), password.getText().toString(), "1231");
            }
        });
    }

    @Override
    public void loginSuccess() {
        JumpUtil.GotoActivity(this, MainActivity.class);
    }

    @Override
    public void showMsg(String msg) {
        msgToast(msg);
    }
}
