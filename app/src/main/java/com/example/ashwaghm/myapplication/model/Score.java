package com.example.ashwaghm.myapplication.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by ashwaghm on 08-Jul-17.
 */

@Table(name = "Scores", id = "dbId")
public class Score extends Model {
    @Column(name = "Subject")
    public String subject;
    @Column(name = "Max")
    public String max;
    @Column(name = "Scored")
    public String scored;

    Score() {

    }

    Score(String subject, String scored, String max) {
        this.subject = subject;
        this.max = max;
        this.scored = scored;
    }

    Score(String subject, String max) {
        this.subject = subject;
        this.max = max;
    }

    public String pretty() {
        return subject + ":" + scored + "/" + max;
    }

    public Score dummyData() {
        Double v = Math.random() * 100;
        this.scored = Integer.toString(v.intValue());
        return this;
    }
}
