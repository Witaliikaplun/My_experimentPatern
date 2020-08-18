package com.example.my_experimentmoxy.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.my_experimentmoxy.R;
import com.example.my_experimentmoxy.retrofit.pojo.Users;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Retrofit2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit2);

        IRequestAPI iRequestAPI = NetworkServiceSingl.getInstance().getiRequestAPI();

         iRequestAPI.loadUsers("2").enqueue(new Callback<Users>() { //enqueue() (для асинхронного вызова)
             @Override
             public void onResponse(Call<Users> call, Response<Users> response) {
                 Log.d("response", response.body().getData().get(0).getEmail());
             }

             @Override
             public void onFailure(Call<Users> call, Throwable t) {
                 Log.d("response", "Fault");
             }
         });
    }
}