package com.example.my_experimentmoxy.room;

import android.app.Application;

import androidx.room.Room;

public class OrmApp extends Application {
    private static OrmApp instance;
    private static MyDatabase myDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        myDatabase = Room.databaseBuilder(getApplicationContext(),MyDatabase.class, "employee").build();
    }

    public static OrmApp getInstance() {
        return instance;
    }

    public static MyDatabase getMyDatabase() {
        return myDatabase;
    }
}
