package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

public class RestClient {
	
	private static final String BASE_URL = "http://api.goeuro.com";
	
	Services mServices;
	
    public RestClient() {
        Gson gson = new GsonBuilder().create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        mServices = retrofit.create(Services.class);
    }

    public Services getServices() {
        return mServices;
    }

}
