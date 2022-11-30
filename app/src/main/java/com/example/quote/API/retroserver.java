package com.example.quote.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class retroserver {
    private  static  final String baseurl="http://type.fit/fit/api/";
    private static Retrofit retro;

    public  static Retrofit connectRetrofit(){
        if(retro==null){
            retro = new Retrofit.Builder().baseUrl(baseurl).addConverterFactory(GsonConverterFactory.create()).build();
        }
    return retro;
    }
}
