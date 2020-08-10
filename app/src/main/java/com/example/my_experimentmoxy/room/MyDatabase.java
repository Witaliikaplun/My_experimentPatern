package com.example.my_experimentmoxy.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/*
* Аннотацией Database помечаем основной класс по работе с базой данных.
* Этот класс должен быть абстрактным и наследовать RoomDatabase.
* В параметрах аннотации Database указываем, какие Entity будут использоваться, и версию базы.
* Для каждого Entity класса из списка entities будет создана таблица.
*/
@Database(entities = Employee.class, version = 1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract IEmployeeDAO iEmployeeDAO();
}
