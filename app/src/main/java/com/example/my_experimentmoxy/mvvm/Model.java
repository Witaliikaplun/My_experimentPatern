package com.example.my_experimentmoxy.mvvm;

public class Model {
    private int counter1;
    private int counter2;
    private int counter3;

    public Model(){
        this.setCounter1(0);
        this.setCounter2(0);
        this.setCounter3(0);
    }


    public int getCounter1() {
        return counter1;
    }

    public void setCounter1(int counter1) {
        this.counter1 = counter1;
    }

    public int getCounter2() {
        return counter2;
    }

    public void setCounter2(int counter2) {
        this.counter2 = counter2;
    }

    public int getCounter3() {
        return counter3;
    }

    public void setCounter3(int counter3) {
        this.counter3 = counter3;
    }
}
