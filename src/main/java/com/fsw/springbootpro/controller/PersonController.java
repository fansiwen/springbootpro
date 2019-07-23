package com.fsw.springbootpro.controller;

import com.fsw.springbootpro.pojo.Person;
import com.fsw.springbootpro.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
   /* @Autowired
    private PersonService personService;

    *//**
     * 根据主键查找
     *//*
    @RequestMapping(value = "/person/{id}",method = RequestMethod.GET)
    public Person getPersonByID(@PathVariable Integer id){
        return personService.getPersonByID(id);
    }

    @RequestMapping(value = "/persons",method = RequestMethod.GET)
    public ArrayList<Person> getPersonList(){
        return personService.getPersons();
    }

    *//**
     * 对查询回来的数据进行分页
     *//*
    @RequestMapping(value = "/pageHelp/{pageNum}/{pageSize}",produces = {"application/json;charset=utf-8"})
    public List<Person> getAllPerson(@PathVariable(value = "pageNum") int pageNum,@PathVariable(value = "pageSize") int pageSize){
        return personService.findAllPersons(pageNum,pageSize);
    }*/
}
