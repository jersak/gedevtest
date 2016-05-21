package com.company;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataFetcher {
	
	public static void retrieveData (String cityName){
		
		Services services = new RestClient().getServices();

		System.out.println("Fetching info from webservice endpoint...");
		
		services.getCityInfo(cityName).enqueue(new Callback<List<CityInfo>>() {
			
			@Override
			public void onResponse(Call<List<CityInfo>> call, Response<List<CityInfo>> response) {
				List<CityInfo> cityInfo = response.body();
				if (cityInfo.size() > 0){
					System.out.println("Success.");
					FWriter.createcsvfile(cityInfo);
				} else {
					System.out.println("No match for the city name supplied.");
				}
			}
			
			@Override
			public void onFailure(Call<List<CityInfo>> arg0, Throwable t) {

				//t.printStackTrace();
				System.out.println("Webservice endpoint is currently unreachable.\nPlease check your internet connection or try again in a few minutes.");
			}
		});
		
		
		
	}

}
