package com.example.my_experimentmoxy.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.my_experimentmoxy.R;

public class MVVMActivity extends AppCompatActivity {

    MVVMModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_v_v_m);

        final TextView tv1 = findViewById(R.id.tv_source);
        final TextView tv2 = findViewById(R.id.tv2);
        final TextView tv3 = findViewById(R.id.tv3);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);


        //В метод ViewModelProviders.of передаем activity, тем самым мы получаем доступ к провайдеру,
        //которой хранит все ViewModel относящиеся к этой Activity. Метод get запрашивает у этого провайдера
        //конкретную ViewModel по имени класса
        //Чтобы принять данные из LiveData необходимо создать ссылку именно таким образом
        //создание ссылки на viewmodel---------------
        viewModel = ViewModelProviders.of(this).get(MVVMModel.class);


        //подписываемся на viewmodel-----------------
        viewModel.getCount1().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                tv1.setText(String.valueOf(integer));
            }
        });

        viewModel.getCount2().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                tv2.setText(String.valueOf(integer));
            }
        });

        viewModel.getCount3().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                tv3.setText(String.valueOf(integer));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.incCount1();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.incCount2();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.incCount3();
            }
        });


    }
}