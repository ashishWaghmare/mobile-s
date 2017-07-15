package com.example.ashwaghm.myapplication.dummy;

import com.example.ashwaghm.myapplication.contracts.Parents;

/**
 * Created by ashwaghm on 08-Jul-17.
 */

public class ParentContent implements Parents{

    /**
     * A dummy authentication store containing known user names and passwords.
     * TODO: remove after connecting to a real authentication system.
     */
    public static final String[] DUMMY_CREDENTIALS = new String[]{
            "foo@example.com:12"
    };


    public static boolean isValid(String username, String password) {
        for (String credential : DUMMY_CREDENTIALS) {
            String[] pieces = credential.split(":");
            if (pieces[0].equals(username)) {
                // Account exists, return true if the password matches.
                return pieces[1].equals(password);
            }
        }
        return false;
    }
}
