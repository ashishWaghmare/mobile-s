package com.example.ashwaghm.myapplication.api;

import com.example.ashwaghm.myapplication.contracts.Students;
import com.example.ashwaghm.myapplication.model.Student;

import java.util.List;


/**
 * Created by sushma on 15/7/17.
 */

public class RemoteAPIStudents implements Students {
    @Override
    public List<Student> myStudents() {
        return null;
    }

    @Override
    public Student myStudent(String id) {
        return null;
    }
}
