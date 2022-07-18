package com.himalaya.springboot.service;

import com.himalaya.springboot.StudentRepository.StudentRepository;
import com.himalaya.springboot.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void printStudent(String name) {

        System.out.println("찾는 학생: " + studentRepository.getStudent(name));
    }

    public void enroll(String name, Integer age, Student.Grade grade) {
        studentRepository.enroll(name, age, grade);
    }

    @PostConstruct
    public void init() {
        enroll("fred", 14, Student.Grade.C);
        enroll("jack", 15, Student.Grade.B);
        enroll("cassie", 18, Student.Grade.A);
    }

}
