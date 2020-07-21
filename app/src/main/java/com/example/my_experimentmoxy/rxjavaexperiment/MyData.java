package com.example.my_experimentmoxy.rxjavaexperiment;

import java.util.Date;

public class MyData extends Date {

    @Override
    public String toString() {
        return super.toString().substring(11, 19);
    }
}
