package com.fsw.springbootpro.fastjsonTest;

import com.alibaba.fastjson.JSON;
import com.fsw.springbootpro.pojo.Person;

import java.util.Date;
import java.util.HashMap;

public class FastJsonDemo {

    public static void main(String[] args) {
        /*序列化Java对象成JSON对象
        Person person = new Person();
        person.setAge(31);
        person.setId(1);
        person.setName("fsw");
        String personText = JSON.toJSONString(person);
        System.out.println(personText);
        HashMap hashMap = new HashMap();
        hashMap.put("key1","value1");
        hashMap.put("key2","value2");
        System.out.println(JSON.toJSONString(hashMap));*/
        //将JSON对象序列化成Java对象
        String personStr = "{\"id\":1,\"age\":31,\"name\":\"fsw\"}";
        Person person = JSON.parseObject(personStr,Person.class);
        System.out.println(person.toString());
        //对Date进行序列化
        Date date = new Date();
        System.out.println(JSON.toJSONString(date));

    }
}
