package com.example.ashwaghm.myapplication.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.example.ashwaghm.myapplication.model.Score;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ashwaghm on 08-Jul-17.
 */

@Table(name = "StudentResults", id = "dbId")
public class StudentResult extends Model {
    @Column(name = "ExamName")
    public String examName;
    @Column(name = "Score ")
    public List<Score> scoreList = new ArrayList<>();

    StudentResult() {

    }

    public StudentResult(String examName) {
        this.examName = examName;
    }

    public StudentResult dummydata() {
        scoreList.add(new Score("English", "100").dummyData());
        scoreList.add(new Score("Marathi", "100").dummyData());
        scoreList.add(new Score("Hindi", "100").dummyData());
        scoreList.add(new Score("Maths", "100").dummyData());
        scoreList.add(new Score("Science", "100").dummyData());
        return this;
    }
}


