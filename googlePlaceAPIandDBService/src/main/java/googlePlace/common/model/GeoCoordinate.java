package googlePlace.common.model;

public class GeoCoordinate {
	private double lat;
	private double lng;
	
	public GeoCoordinate(){
    	this.lat = 0;
    	this.lng = 0;		
    }
	
	public GeoCoordinate(double lat, double lng) {
		this.lat = lat;
		this.lng = lng;
	}

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
	
	@Override
    public String toString()
    {
        return "GeoCoordinate [lng = "+lng+", lat = "+lat+"]";
    }
}
