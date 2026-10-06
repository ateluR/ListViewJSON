package com.onaar.jsonnaocene;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET
public interface ApiService {

        @GET("pytania")
        public Call<List<Pytania>> getPytania();

}
