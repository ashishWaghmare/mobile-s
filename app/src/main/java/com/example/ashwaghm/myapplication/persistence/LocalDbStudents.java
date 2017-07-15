package com.example.ashwaghm.myapplication.persistence;

import com.activeandroid.query.Select;
import com.example.ashwaghm.myapplication.contracts.Students;
import com.example.ashwaghm.myapplication.model.Student;

import java.util.List;

/**
 * Created by sushma on 15/7/17.
 */

public class LocalDbStudents implements Students {
    @Override
    public List<Student> myStudents() {
        return new Select()
                .from(Student.class)
                .execute();
    }

    @Override
    public Student myStudent(String id) {
        return new Select().from(Student.class).where("Id = ?", id).executeSingle();
    }

    public static LocalDbStudents getInstance() {
        if (instance == null) {
            instance = new LocalDbStudents();
        }
        return instance;
    }

    private static LocalDbStudents instance;
}
