package pojo;

public class Location {
	/*
	 * {
	  "location": {
	    "lat": -38.383494,
	    "lng": 33.427362
	  },
	  "accuracy": 50,
	  "name": "Frontline house",
	  "phone_number": "(+91) 983 893 3937",
	  "address": "29, side layout, cohen 09",
	  "types": [
	    "shoe park",
	    "shop"
	  ],
	  "website": "http://google.com",
	  "language": "French-IN"
	}
	 */	
	private double lat;
	private double lng;
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	
	
	
}
