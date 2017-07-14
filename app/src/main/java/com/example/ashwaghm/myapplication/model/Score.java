package com.example.ashwaghm.myapplication.model;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by ashwaghm on 08-Jul-17.
 */

@Table(name = "Scores")
public class Score {
    @Column(name = "Subject")
    public String subject;
    @Column(name = "Max")
    public String max;
    @Column(name = "Scored")
    public String scored;

    Score(String subject, String scored, String max) {
        this.subject = subject;
        this.max = max;
        this.scored = scored;
    }

    Score(String subject, String max) {
        this.subject = subject;
        this.max = max;
        Double v = Math.random() * 100;
        this.scored = Integer.toString(v.intValue());
    }

    public String pretty() {
        return subject + ":" + scored + "/" + max;
    }
}
