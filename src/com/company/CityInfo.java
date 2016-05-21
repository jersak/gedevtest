package com.company;

import com.google.gson.annotations.SerializedName;

public class CityInfo {
	
	@SerializedName("_id")
	private long mId;
	
	@SerializedName("name")
	private String mName;
	
	@SerializedName("type")
	private String mType;
	
	@SerializedName("geo_position")
	private Geoposition mGeo;

	public Geoposition getmGeo() {
		return mGeo;
	}

	public long getmId() {
		return mId;
	}

	public String getmName() {
		return mName;
	}

	public String getmType() {
		return mType;
	}
}