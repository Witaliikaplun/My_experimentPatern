package com.example.my_experimentmoxy.mvp;

public class Presenter {
    Model model;
    IMVPAct imvpAct;

    Presenter(IMVPAct imvpAct){
        this.model = new Model();
        this.imvpAct = imvpAct;
    }

    void metodPresenter(){
        model.setCount(model.getCount() + 1);
        imvpAct.setText(String.valueOf(model.getCount()));
    }



}
