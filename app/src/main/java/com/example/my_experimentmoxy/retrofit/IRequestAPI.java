package com.example.my_experimentmoxy.retrofit;

import com.example.my_experimentmoxy.retrofit.pojo.Users;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IRequestAPI {
    @GET("users")
    Call<Users> loadUsers(@Query("page") String pageNum);
}
