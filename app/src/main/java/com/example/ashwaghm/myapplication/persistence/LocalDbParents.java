package com.example.ashwaghm.myapplication.persistence;

import com.example.ashwaghm.myapplication.contracts.Parents;

/**
 * Created by sushma on 15/7/17.
 */

public class LocalDbParents implements Parents {

    public static LocalDbParents getInstance() {
        if (instance == null) {
            instance = new LocalDbParents();
        }
        return instance;
    }

    private static LocalDbParents instance;
}
