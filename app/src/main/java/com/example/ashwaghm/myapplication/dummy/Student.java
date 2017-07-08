package com.example.ashwaghm.myapplication.dummy;

/**
 * Created by ashwaghm on 08-Jul-17.
 */

public class Student {
    public final String id;
    public final String content;
    public final String details;

    public Student(String id, String content, String details) {
        this.id = id;
        this.content = content;
        this.details = details;
    }

    @Override
    public String toString() {
        return content;
    }
}
