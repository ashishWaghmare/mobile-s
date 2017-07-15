package com.example.ashwaghm.myapplication.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashwaghm on 08-Jul-17.
 */

@Table(name = "Students", id = "dbId")
public class Student extends Model {

    @Column(name = "Id")
    public String id;

    @Column(name = "Content")
    public String content;

    @Column(name = "Detail")
    public String detail;

    @Column(name = "StudentResults")
    public List<StudentResult> result = new ArrayList<>();

    Student() {

    }

    public Student(String id, String content, String details) {
        this.id = id;
        this.content = content;
        this.detail = details;
    }

    @Override
    public String toString() {
        return content;
    }

    public List<StudentResult> getResult() {
        List<StudentResult> dbResult;
        if (true) {
            dbResult = getMany(StudentResult.class, "Student");
        }
        if (dbResult.size() > 0) {
            return dbResult;
        }
        return result;
    }

    public void setResult(List<StudentResult> result) {
        this.result = result;
    }

    public void add(StudentResult result) {
        this.result.add(result);
    }
}
