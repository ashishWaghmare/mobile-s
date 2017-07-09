package com.example.ashwaghm.myapplication.dummy;

import android.widget.TextView;

import java.util.Random;

/**
 * Created by ashwaghm on 08-Jul-17.
 */

public class Score {
    public String subject;
    public String max;
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
