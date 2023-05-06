package com.example.demo.services;

import com.example.demo.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {


    public List<Student> hetHello (){
        return
                List.of(
                        new Student(0,"ozkan","sari",23),
                        new Student(1,"mehmet","has",33),
                        new Student(3,"nazan","oguz",45)
                );

    }

    public Student getStudent (int id){
        List studentse = new ArrayList<Student>();
      studentse.add(new Student(0,"ozkan","sari",23));
      studentse.add(new Student(1,"mehmet","has",33));
      studentse.add(new Student(3,"nazan","oguz",45));

       Student finder = (Student) studentse.get(id);
        return finder;



    }
}
