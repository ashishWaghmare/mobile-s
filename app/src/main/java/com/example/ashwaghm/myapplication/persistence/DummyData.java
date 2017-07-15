package com.example.ashwaghm.myapplication.persistence;

import com.example.ashwaghm.myapplication.contracts.Students;
import com.example.ashwaghm.myapplication.dummy.StudentContent;
import com.example.ashwaghm.myapplication.model.Score;
import com.example.ashwaghm.myapplication.model.Student;
import com.example.ashwaghm.myapplication.model.StudentResult;

/**
 * Created by sushma on 15/7/17.
 */

public class DummyData {

    private StudentContent students = StudentContent.getInstance();


    public void generateStudentInDB() {
        // Add some sample items.
        generateExamInDB(new Student("123", "Aryan Shri", "Need improvements")).dummydata().save();
        new Student("124", "Shrinivas Rathi", "Good in Maths").dummydata().save();
        new Student("125", "Rahul Gajan", "Strong all over").dummydata().save();
        new Student("126", "Amit Bala", "Poor in discipline").dummydata().save();

    }

    public Student generateExamInDB(Student student) {
        student.add(generateResultInDB(new StudentResult(student, "Unit-1").dummydata()));
        student.add(generateResultInDB(new StudentResult(student, "Unit-2").dummydata()));
        student.add(generateResultInDB(new StudentResult(student, "Term-1").dummydata()));
        student.add(generateResultInDB(new StudentResult(student, "Unit-1").dummydata()));
        student.add(generateResultInDB(new StudentResult(student, "Unit-2").dummydata()));
        student.add(generateResultInDB(new StudentResult(student, "Term-1").dummydata()));
        return student;
    }

    public StudentResult generateResultInDB(StudentResult result) {
        result.add(generateScoreInDB(new Score(result, "English", "100").dummyData()));
        result.add(generateScoreInDB(new Score(result, "Marathi", "100").dummyData()));
        result.add(generateScoreInDB(new Score(result, "Hindi", "100").dummyData()));
        result.add(generateScoreInDB(new Score(result, "Maths", "100").dummyData()));
        result.add(generateScoreInDB(new Score(result, "Science", "100").dummyData()));
        return result;
    }

    public Score generateScoreInDB(Score score) {
        score.save();
        return score;
    }


}