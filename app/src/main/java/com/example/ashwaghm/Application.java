package com.example.ashwaghm;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.Configuration;
import com.activeandroid.query.Delete;
import com.example.ashwaghm.myapplication.model.Score;
import com.example.ashwaghm.myapplication.model.Student;
import com.example.ashwaghm.myapplication.model.StudentResult;
import com.example.ashwaghm.myapplication.persistence.DummyData;

/**
 * Created by sushma on 15/7/17.
 */

public class Application extends com.activeandroid.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Configuration.Builder config = new Configuration.Builder(this);
        config.addModelClasses(Student.class, Score.class, StudentResult.class);
        ActiveAndroid.initialize(config.create());
        //new DummyData().generateStudentInDB();
        //new Delete().from(Student.class).execute();
    }
}