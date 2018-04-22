package com.mvp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @BindView(R.id.tv_retrofit)
    TextView tvRetrofit;
    @BindView(R.id.tv_rxjava)
    TextView tvRxjava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.tv_retrofit, R.id.tv_rxjava})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_retrofit:
                startActivity(new Intent(this,RetrofitActivity.class));
                break;
            case R.id.tv_rxjava:
                startActivity(new Intent(this,RxActivity.class));
                break;
        }
    }
}
