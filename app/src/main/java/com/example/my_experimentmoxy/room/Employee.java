package com.example.my_experimentmoxy.room;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;


//Аннотацией Entity помечаем объект который будет храниться в базе данных
//В качестве имени таблицы будет использовано имя класса.
//А поля таблицы будут созданы в соответствии с полями класса.
@Entity(tableName = "employee")
public class Employee {

    @PrimaryKey //Аннотацией PrimaryKey мы помечаем поле, которое будет ключом в таблице.
    private long id;
    private String name;
    //@Ignore - этой аннотацией помечают если мы не хотим чтобы поле попало в БД
    private int salary;
    /*
    * если поля публичны, то геттеры и сеттеры не обязательны
    * если приватные, то обязательно должны быть геттеры и сеттреы
    *
    * Если хотим добывить внутренний класс с полями, то его добавляют аннотацией @Embedded
    * */


    public Employee(long id, String name, int salary) {
        this.setId(id);
        this.setName(name);
        this.setSalary(salary);
    }

    @NonNull
    @Override
    public String toString() {
        return "id = " + getId() + " : " + "name = " + getName() + " : " + "salary = " + getSalary() + ";";
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
