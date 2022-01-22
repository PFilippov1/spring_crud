package com.javamaster.spring_crud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "users_table") //таблица из бд
@Data//lombok аннотация: генерирует геттеры, сеттеры, иквалс, хеш код методы
@NoArgsConstructor//lombok аннотация: конструктор без аргуметов
public class Users { // класс оторбражения сущности
    //поля аннотации java persistence: Table, Entity, Column, Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //вид стратегии генерации первичного ключа обычно известен как саморазвитие первичного ключа
    private Integer id; // поля из таблицы

    @Column
    private String name;

    @Column
    private String login;

    @Column
    @NotEmpty
    @Email(regexp = "[A-Za-z0-9._%-+]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}")
    //@Pattern(regexp="[A-Za-z0-9._%-+]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}")
    private String email;

}
