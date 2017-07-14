package com.example.ashwaghm.myapplication.model;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.example.ashwaghm.myapplication.model.Score;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ashwaghm on 08-Jul-17.
 */

@Table(name = "Students")
public class StudentResult {
    @Column(name="ExamName")
    public final String examName;
    @Column(name="Score ")
    public final List<Score> scoreList = new ArrayList<>();

    public StudentResult(String examName) {
        this.examName = examName;
    }

    {
        scoreList.add(new Score("English", "100"));
        scoreList.add(new Score("Marathi", "100"));
        scoreList.add(new Score("Hindi", "100"));
        scoreList.add(new Score("Maths", "100"));
        scoreList.add(new Score("Science", "100"));
    }
}
