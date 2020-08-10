package com.example.my_experimentmoxy.room;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.my_experimentmoxy.R;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class RoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        MyDatabase myDatabase = Singleton.getInstance(this).getMyDatabase();

        TextView tv1 = findViewById(R.id.tv_source);
        TextView tv2 = findViewById(R.id.tv_result);
        Button btn_insert = findViewById(R.id.btn_insert);
        Button btn_update = findViewById(R.id.btn_update);
        Button btn_delete = findViewById(R.id.btn_delete);
        Button btn_selectall = findViewById(R.id.btn_select_all);
        Button btn_selectid = findViewById(R.id.btn_select_id);

        List<Employee> list = new ArrayList<>();
        String[] name = {"Martin", "Patric", "Djec"};
        Long[] id = {1L, 2L, 3L};
        Integer[] salary = {100000, 150000, 280000};

        for (int i = 0; i < 3; i++) {
            list.add(new Employee(id[i], name[i], salary[i]));
        }

        for (int i = 0; i < list.size(); i++) {
            tv1.append(list.get(i).toString() + "\n");
        }

        btn_insert.setOnClickListener(v -> {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    myDatabase.iEmployeeDAO().insert(list);
                }
            });

        });

        btn_selectall.setOnClickListener(v -> {
            Observable.just(myDatabase.iEmployeeDAO().getAll())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Consumer<List<Employee>>() {
                        @Override
                        public void accept(List<Employee> employees) throws Exception {
                            for (int i = 0; i < employees.size(); i++) {
                                tv2.append(list.get(i).toString());
                            }
                        }
                    });

            });







    }
}