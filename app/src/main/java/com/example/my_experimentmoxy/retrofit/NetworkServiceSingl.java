package com.example.my_experimentmoxy.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkServiceSingl {
    private static NetworkServiceSingl instance = null;
    private Retrofit retrofit;
    private IRequestAPI iRequestAPI;

    public NetworkServiceSingl() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        iRequestAPI = retrofit.create(IRequestAPI.class);
    }

    public static NetworkServiceSingl getInstance() {
        if(instance == null){
            instance = new NetworkServiceSingl();
        }
        return instance;
    }

    public IRequestAPI getiRequestAPI(){
        return iRequestAPI;
    }
}
