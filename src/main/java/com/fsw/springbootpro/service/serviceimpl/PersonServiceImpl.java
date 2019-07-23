package com.fsw.springbootpro.service.serviceimpl;

import com.fsw.springbootpro.mapper.PersonMapper;
import com.fsw.springbootpro.pojo.Person;
import com.fsw.springbootpro.service.PersonService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{
    /*@Autowired
    private PersonMapper personMapper;
    @Override
    public Person getPersonByID(int id) {
        return personMapper.getPersonByID(id);
    }

    @Override
    public ArrayList<Person> getPersons() {
        return personMapper.getPersons();
    }

    @Override
    public int addPerson(Person person) {
        return personMapper.insert(person);
    }

    *//**
     * 这个方法使用到了分页插件
     * @param pageNum 开始页数
     * @param pageSize 每页显示条数
     * @return
     *//*
    @Override
    public List<Person> findAllPersons(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return personMapper.selectAll();
    }*/

}
