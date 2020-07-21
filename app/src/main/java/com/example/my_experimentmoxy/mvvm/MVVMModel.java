package com.example.my_experimentmoxy.mvvm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MVVMModel extends ViewModel {
    private Model model;

    MutableLiveData<Integer> count1 = new MutableLiveData<>();
    MutableLiveData<Integer> count2 = new MutableLiveData<>();
    MutableLiveData<Integer> count3 = new MutableLiveData<>();

    public MVVMModel(){
        model = new Model();
    }

    public void incCount1(){
        int newValue = model.getCounter1() + 1;
        model.setCounter1(newValue);
        count1.setValue(newValue);
    }

    public void incCount2(){
        int newValue = model.getCounter2() + 1;
        model.setCounter2(newValue);
        count2.setValue(newValue);
    }

    public void incCount3(){
        int newValue = model.getCounter3() + 1;
        model.setCounter3(newValue);
        count3.setValue(newValue);
    }
}
