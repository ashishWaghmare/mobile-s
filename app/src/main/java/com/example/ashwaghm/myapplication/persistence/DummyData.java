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
        populate("123", "Aryan Shri", "Need improvements");
        populate("124", "Shrinivas Rathi", "Good in Maths");
        populate("125", "Rahul Gajan", "Strong all over");
        populate("126", "Amit Bala", "Poor in discipline");
    }

    public void populate(String id, String name, String details) {
        Student student = new Student(id, name, details);
        student.save();
        generateExamInDB(student);
    }

    public Student generateExamInDB(Student student) {
        populate(student, "Unit-1");
        populate(student, "Unit-2");
        populate(student, "Term-1");
        populate(student, "Unit-1");
        populate(student, "Unit-2");
        populate(student, "Term-2");

        return student;
    }

    public void populate(Student student, String examName) {
        StudentResult result = new StudentResult(student, "Unit-1");
        result.save();
        student.add(generateResultInDB(result));
    }

    public StudentResult generateResultInDB(StudentResult result) {
        populate(result, "English", "100");
        populate(result, "Marathi", "100");
        populate(result, "Hindi", "100");
        populate(result, "Maths", "100");
        populate(result, "Science", "100");
        return result;
    }

    public void populate(StudentResult result, String subject, String max) {
        Score score = new Score(result, subject, max).dummyData();
        score.save();
        result.add(score);
    }

    public Score generateScoreInDB(Score score) {
        score.save();
        return score;
    }


}