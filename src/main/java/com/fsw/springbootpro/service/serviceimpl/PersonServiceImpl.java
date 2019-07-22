package com.fsw.springbootpro.service.serviceimpl;

import com.fsw.springbootpro.mapper.PersonMapper;
import com.fsw.springbootpro.pojo.Person;
import com.fsw.springbootpro.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonMapper personMapper;
    @Override
    public Person getPersonByID(int id) {
        return personMapper.getPersonByID(id);
    }
}
