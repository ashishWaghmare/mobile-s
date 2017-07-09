package com.example.ashwaghm.myapplication.dummy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashwaghm on 08-Jul-17.
 */

public class Student {
    public final String id;
    public final String content;
    public final String details;
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
