package com.example.demomvplast;

import android.util.Log;

import com.example.demomvplast.Base.BaseActivity;
import com.example.demomvplast.MyDemo.ListBean;
import com.example.demomvplast.MyDemo.MyPresenter;
import com.example.demomvplast.MyDemo.MyView;
import com.example.demomvplast.httpUtils.ToastUtil;

public class MainActivity extends BaseActivity<MyPresenter, MyView> implements MyView {


//    @BindView(R.id.tv)
//    TextView tv;

    @Override
    protected void initData() {
        basePresenter.getData();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getlayout() {
        return R.layout.activity_main;
    }

    @Override
    protected MyPresenter initPresenter() {
        return new MyPresenter();
    }

    @Override
    public void onSS(ListBean bean) {
       // tv.setText(bean.getData().toString());
        ToastUtil.showShort("获取数据成功");
        Log.e("123", "onSS: " + bean.getData().toString());
    }

    @Override
    public void onFail(String msg) {
        Log.e("123", "onFail: "+msg );
    }


}
