package com.javamaster.spring_crud.service;

import com.javamaster.spring_crud.dto.UsersDto;
import com.javamaster.spring_crud.exception.ValidationException;

import javax.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface UsersService {
//методы которые нам нужны для работы
    UsersDto saveUser(UsersDto usersDto) throws ValidationException, javax.xml.bind.ValidationException;

    void deleteUser(Integer userId );

    UsersDto findByLogin(String login);

    List<UsersDto> findAll();
}
