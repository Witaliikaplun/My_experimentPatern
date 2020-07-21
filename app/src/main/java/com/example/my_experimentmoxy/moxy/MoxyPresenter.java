package com.example.my_experimentmoxy.moxy;



import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class MoxyPresenter extends MvpPresenter<IMVPmoxyAct> {
    Modelmoxy model;


    MoxyPresenter(){
        this.model = new Modelmoxy();
    }

    void metodPresenter(){
        model.setCount(model.getCount() + 1);
        getViewState().setText(String.valueOf(model.getCount()));
    }



}
