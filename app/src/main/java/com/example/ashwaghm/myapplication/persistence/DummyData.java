package com.example.ashwaghm.myapplication.persistence;

import com.example.ashwaghm.myapplication.contracts.Students;
import com.example.ashwaghm.myapplication.dummy.StudentContent;
import com.example.ashwaghm.myapplication.model.Student;

/**
 * Created by sushma on 15/7/17.
 */

public class DummyData {

    private StudentContent students = StudentContent.getInstance();

    public void generate() {
        // Add some sample items.
        students.addItem(new Student("123", "Aryan Shri", "Need improvements").dummydata());
        students.addItem(new Student("124", "Shrinivas Rathi", "Good in Maths").dummydata());
        students.addItem(new Student("125", "Rahul Gajan", "Strong all over").dummydata());
        students.addItem(new Student("126", "Amit Bala", "Poor in discipline").dummydata());
        for (int i = 1; i <= 0; i++) {
            students.addItem(StudentContent.createDummyItem(i));
        }
    }

    public void generateInDB() {
        // Add some sample items.
        new Student("123", "Aryan Shri", "Need improvements").dummydata().save();
        new Student("124", "Shrinivas Rathi", "Good in Maths").dummydata().save();
        new Student("125", "Rahul Gajan", "Strong all over").dummydata().save();
        new Student("126", "Amit Bala", "Poor in discipline").dummydata().save();

    }


}