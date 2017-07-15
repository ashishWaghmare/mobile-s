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
    @Column(name = "content")
    public String content;

    @Column(name = "Details")
    public String details;

    @Column(name = "StudentResults")
    public List<StudentResult> result = new ArrayList<>();

    public Student dummydata() {
        getResult().add(new StudentResult(this,"Unit-1").dummydata());
        getResult().add(new StudentResult(this,"Unit-2").dummydata());
        getResult().add(new StudentResult(this,"Term-1").dummydata());
        getResult().add(new StudentResult(this,"Unit-1").dummydata());
        getResult().add(new StudentResult(this,"Unit-2").dummydata());
        getResult().add(new StudentResult(this,"Term-1").dummydata());
        return this;
    }

    Student() {

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

    public void add(StudentResult result) {
        this.result.add(result);
    }
}
