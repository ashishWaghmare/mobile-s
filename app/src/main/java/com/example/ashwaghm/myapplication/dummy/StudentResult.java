package com.example.ashwaghm.myapplication.dummy;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ashwaghm on 08-Jul-17.
 */

public class StudentResult {
    public final String examName;
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
