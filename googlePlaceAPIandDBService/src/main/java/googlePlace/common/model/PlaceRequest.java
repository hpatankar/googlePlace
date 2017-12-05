package googlePlace.common.model;

public class PlaceRequest {
	private Location location;
	private double radius;
	private String placeType;
	private String databaseName;
	
	public PlaceRequest() {
		this.location = null;
		this.radius = 0;
		this.placeType = null;
		this.databaseName = null;
	}
	
	public PlaceRequest(Location location, double radius, String placeType, String databaseName) {
		this.location = location;
		this.radius = radius;
		this.placeType = placeType;
		this.databaseName = databaseName;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getPlaceType() {
		return placeType;
	}

	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	
	
	
}
