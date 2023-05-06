package com.example.demo.controller;

import com.example.demo.Student;
import com.example.demo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ( path = "/api/v1")
public class HelloController {
    private  final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;

    }

    @GetMapping(path = "/students" )
    public List<Student> getStudent (){
        return helloService.hetHello();
    }

    @GetMapping(path = "/student/id" )
    public Student getStudentid (){
        return helloService.getStudent(2);
    }




}
