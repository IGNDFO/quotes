package com.example.quote.API;

import com.example.quote.MODEL.Quotesmodel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API_request_data {
    @GET("quotes")

   Call<List<Quotesmodel>> requestdata( );
}
