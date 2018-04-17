package com.z2wenfa.tmvpdemo.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

import com.z2wenfa.tmvpdemo.util.JumpUtil;
import com.z2wenfa.tmvpdemo.util.ToastUtil;
import com.z2wenfa.tmvpdemo.util.rxjava.RxjavaUtil;
import com.z2wenfa.tmvpdemo.util.rxjava.bean.UITask;

/**
 * Activity基类
 * Created by z2wenfa on 2016/8/25.
 */
public abstract class BaseActivity<T extends BasePresenter, E extends BaseModel> extends Activity implements  JumpUtil.JumpInterface {
    public T mPresenter;
    public E mModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    protected void init() {
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        setContentView(getLayoutResID());
        mPresenter = TUtil.getT(this, 0);
        mModel = TUtil.getT(this, 1);
        if (this instanceof BaseView) mPresenter.setVM(this, mModel);

        initView();


    }

    /**
     * 获得Layout文件id
     *
     * @return
     */
    protected abstract int getLayoutResID();


    protected abstract void initView();


    /**
     * 统一toast
     *
     * @return
     */
    public void msgToast(final String msg) {
        RxjavaUtil.doInUIThread(new UITask<String>(msg) {
            @Override
            public void doInUIThread() {
                ToastUtil.show(msg);
            }
        });
    }




}
