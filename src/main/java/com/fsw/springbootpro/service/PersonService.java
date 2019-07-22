package com.fsw.springbootpro.service;

import com.fsw.springbootpro.pojo.Person;
public interface PersonService {
    /**
     * 根据ID查找
     */
    Person getPersonByID(int id);
}
