package com.example.my_experimentmoxy.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.my_experimentmoxy.R;

public class MVPActivity extends AppCompatActivity implements IMVPAct {
    TextView tv1;
    Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvp_activity_main);

        tv1 = findViewById(R.id.tv_source);
        Button btn1 = findViewById(R.id.btn1);
        presenter = new Presenter(this);

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