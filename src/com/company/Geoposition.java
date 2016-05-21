package com.company;

import com.google.gson.annotations.SerializedName;

public class Geoposition {

	@SerializedName("latitude")
	private double lat;

	@SerializedName("longitude")
	private double lon;
	
	public double getLat() {
		return lat;
	}

	public double getLon() {
		return lon;
	}

}
