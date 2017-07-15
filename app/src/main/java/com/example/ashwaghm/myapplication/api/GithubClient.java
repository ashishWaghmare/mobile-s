package com.example.ashwaghm.myapplication.api;

import com.example.ashwaghm.myapplication.security.User;

import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by sushma on 15/7/17.
 */

public interface GithubClient {

    @GET("/users/{user}/repos")
    User getUser(@Path("user") String user);
}
