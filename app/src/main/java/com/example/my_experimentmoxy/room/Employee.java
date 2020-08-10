package com.example.my_experimentmoxy.room;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


//Аннотацией Entity помечаем объект который будет храниться в базе данных
//В качестве имени таблицы будет использовано имя класса.
//А поля таблицы будут созданы в соответствии с полями класса.
@Entity
public class Employee {

    @PrimaryKey //Аннотацией PrimaryKey мы помечаем поле, которое будет ключом в таблице.
    public long id;
    public String name;
    public int salary;

    public Employee(long id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @NonNull
    @Override
    public String toString() {
        return "id = " + id + " : " + "name = " + name + " : " + "salary = " + salary + ";";
    }
}
