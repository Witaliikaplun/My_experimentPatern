package com.example.my_experimentmoxy.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/*
В объекте Dao мы будем описывать методы для работы с базой данных.
Нам нужны будут методы для получения списка сотрудников и для добавления/изменения/удаления сотрудников.
Описываем их в интерфейсе с аннотацией Dao:
*/
@Dao
public interface IEmployeeDAO {
    //SQL запрос звучит так:"ВЫБРАТЬ ВСЕ ИЗ EMPLOYEE"
    //роегистр в имени таблици роли не играет
    @Query("SELECT * FROM employee")
    List<Employee> getAll();

    //SQL запрос звучит так:"ВЫБРАТЬ ВСЕ ИЗ EMPLOYEE ГДЕ ID = ID(нужному id) "
    @Query("SELECT * FROM employee WHERE id = :id")
    Employee getById(long id);

    /*
    * Для вставки/обновления/удаления используются методы insert/update/delete
    * с соответствующими аннотациями. Тут никакие запросы указывать не нужно.
    * Названия методов могут быть любыми. Главное - аннотации.
    */
    @Insert
    void insert(List<Employee> employee);

    //Мы можем указать стратегию вставки на тот случай если указанные объекты уже будут в базе
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void insert(List<Employee> employee);

    @Update
    void update(Employee employee);

    @Delete
    void delete(Employee employee);
}
