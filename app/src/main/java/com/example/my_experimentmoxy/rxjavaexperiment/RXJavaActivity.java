package com.example.my_experimentmoxy.rxjavaexperiment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.Time;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.my_experimentmoxy.R;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import moxy.InjectViewState;
//import rx.Observable;
//import rx.Observer;
//import rx.Scheduler;
//import rx.Subscriber;
//import rx.Subscription;
//import rx.functions.Action;
//import rx.functions.Action1;
//import rx.functions.Func1;
//import rx.functions.Func2;
//import rx.observables.ConnectableObservable;
//import rx.schedulers.Schedulers;
//import rx.subjects.PublishSubject;
//import rx.subjects.Subject;

public class RXJavaActivity extends AppCompatActivity {

    Button button;
    Boolean flag;
    Long accum = 0L;

    //    Subscription subscription;
//    ConnectableObservable <Long> observable;
//    Observer<String> observer1;
//    Observer<Long> observer2;
//    PublishSubject<Cat> subject;
//    Action1<Cat> action1;
//    TextView tv;
//    Cat cat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_x_java);

//        tv = findViewById(R.id.textView);
//        subject = PublishSubject.create();
//
//         cat = new Cat("Tom", 5);
//
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                subject.onNext(cat);
//            }
//        });
//
//        action1 = new Action1<Cat>() {
//            @Override
//            public void call(Cat catL) {
//                tv.setText(catL.getName());
//            }
//        };
//
//        subject.subscribe(action1);

        Observable<Long> observable = Observable.interval(1, TimeUnit.SECONDS)
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        Log.d("mylog", Thread.currentThread().getName());
                    }
                });
                observable.subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        Log.d("mylog", String.valueOf(aLong));
                    }
                });




    }
}