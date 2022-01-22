package com.javamaster.spring_crud.dto;

import com.javamaster.spring_crud.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data //— генерирует геттеры, сеттеры
@Builder //
@AllArgsConstructor //  генерирует конструктор для всех полей класса

public class UsersDto {// DTO — это простой java класс, который служит для передачи данных между слоями
//Именно в этот класс мы будем превращать нашу сущность юзер когда достанем данные из базы.
// Также этот класс будет нам служить трансфером между клиентом, контроллером и сервисом.
    @Id
    @GeneratedValue
    private Integer id;
    private String name; //будут такие же поля как и в нашей сущности User
    private String login;
    private String email;
}

