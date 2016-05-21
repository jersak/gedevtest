package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

public class RestClient {
	
	private static final String BASE_URL = "http://api.goeuro.com";
	
	Services mServices;
	
	public RestClient() {
        Gson gson = new GsonBuilder().create();

        //Debug -start-

        //HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        //logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        //OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        //httpClient.addInterceptor(logging);

        //Debug -end-

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                //.client(httpClient.build()) //Debugging output
                .build();

        mServices = retrofit.create(Services.class);
    }

    public Services getServices() {
        return mServices;
    }

}
