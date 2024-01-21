package com.sphz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="name") String name) {
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            student.setName("学生："+i);
            student.setCode(i+"");
            student.setAge(i + 10);
            list.add(student);
        }
        name  = null;
//        if(name.contains("李")){
//        if("李昊".equals(name)){
          if("李昊".contains(name)){
            System.out.println("name命中");
        }
        return name;
    }
}


class Student{
         private String name;
         private String code;
         private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


// lombok