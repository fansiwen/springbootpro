package com.fsw.springbootpro.controller;

import com.fsw.springbootpro.pojo.Person;
import com.fsw.springbootpro.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    /**
     * 根据主键查找
     */
    @RequestMapping(value = "/person/{id}",method = RequestMethod.GET)
    public Person getPersonByID(@PathVariable Integer id){
        return personService.getPersonByID(id);
    }
}
