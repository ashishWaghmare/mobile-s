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

    @Column(name = "Student")
    public Student student;
    @Column(name = "ExamName")
    public String examName;
    @Column(name = "Score ")
    public List<Score> scoreList = new ArrayList<>();

    StudentResult() {

    }

    public StudentResult(Student student, String examName) {
        this.examName = examName;
        this.student = student;
    }

    public StudentResult dummydata() {
        scoreList.add(new Score(this,"English", "100").dummyData());
        scoreList.add(new Score(this,"Marathi", "100").dummyData());
        scoreList.add(new Score(this,"Hindi", "100").dummyData());
        scoreList.add(new Score(this,"Maths", "100").dummyData());
        scoreList.add(new Score(this,"Science", "100").dummyData());
        return this;
    }

    public void add(Score score) {
        scoreList.add(score);
    }
}


