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

	public String[] getData() {
		String[] data = new String[5];
		data[0] = String.valueOf(getmId());
		data[1] = getmName();
		data[2] = getmType();
		data[3] = String.valueOf(getmGeo().getLat());
		data[4] = String.valueOf(getmGeo().getLon());
		return data;
	}
}