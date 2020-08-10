package com.example.my_experimentmoxy.moxy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.my_experimentmoxy.R;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;

public class MOXYActivity extends MvpAppCompatActivity implements IMVPmoxyAct {
    TextView tv1;

    @InjectPresenter
    MoxyPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvp_activity_main1);

        tv1 = findViewById(R.id.tv_source);
        Button btn1 = findViewById(R.id.btn1);
        //presenter = new Presenter(this);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.metodPresenter();
            }
        });
    }

    @Override
    public void setText(String text) {
        tv1.setText(text);
    }
}