package com.example.ashwaghm.myapplication.contracts;

import com.example.ashwaghm.myapplication.dummy.StudentContent;
import com.example.ashwaghm.myapplication.model.Student;

import java.util.List;

/**
 * Created by sushma on 15/7/17.
 */

public interface Students {

    List<Student> myStudents();

    Student myStudent(String id);


}
