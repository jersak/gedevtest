package com.company;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface Services {
	
	@GET("/api/v2/position/suggest/en/{cityName}")
	Call<List<CityInfo>> getCityInfo(@Path("cityName") String cityName);

}
