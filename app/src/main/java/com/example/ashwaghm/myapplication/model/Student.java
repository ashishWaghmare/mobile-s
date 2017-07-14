package com.example.ashwaghm.myapplication.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashwaghm on 08-Jul-17.
 */

@Table(name = "Students")
public class Student extends Model {

    @Column(name = "Id")
    public final String id;
    @Column(name = "content")
    public final String content;

    @Column(name = "Details")
    public final String details;

    @Column(name = "StudentResult")
    public List<StudentResult> result = new ArrayList<>();

    {
        getResult().add(new StudentResult("Unit-1"));
        getResult().add(new StudentResult("Unit-2"));
        getResult().add(new StudentResult("Term-1"));
        getResult().add(new StudentResult("Unit-1"));
        getResult().add(new StudentResult("Unit-2"));
        getResult().add(new StudentResult("Term-1"));
    }

    public Student(String id, String content, String details) {
        this.id = id;
        this.content = content;
        this.details = details;
    }

    @Override
    public String toString() {
        return content;
    }

    public List<StudentResult> getResult() {
        return result;
    }

    public void setResult(List<StudentResult> result) {
        this.result = result;
    }
}
