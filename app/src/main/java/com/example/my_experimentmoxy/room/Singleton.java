package com.example.my_experimentmoxy.room;

import android.content.Context;

import androidx.room.Room;

public final class Singleton {
    private static Singleton instance = null;

    private MyDatabase myDatabase;
    private Singleton(Context context){
        myDatabase = Room.databaseBuilder(context, MyDatabase.class, "database").build();
    }

    public static Singleton getInstance(Context context){
        if(instance == null){
            instance = new Singleton(context);
        }
        return instance;
    }

    public MyDatabase getMyDatabase() {
        return myDatabase;
    }
}
