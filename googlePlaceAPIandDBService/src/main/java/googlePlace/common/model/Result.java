package googlePlace.common.model;

import java.util.ArrayList;
import java.util.List;

public class Result {
	private String icon;
	private String place_id;
	private String scope;
	private String reference;
	private Geometry geometry;
	private Opening_hours opening_hours;
	private String id;
	private List<Photo> photo;
	private int price_level;
	private String vicinity;
	private String name;
	private Double rating;
	private List<String> types;

	protected Result() {
		this.photo = new ArrayList<Photo>();
		this.types = new ArrayList<String>();
	}

	public Result(String icon, String place_id, String scope, String reference, Geometry geometry,
			Opening_hours opening_hours, String id, List<Photo> photo, int price_level, String vicinity,
			String name, double rating, List<String> types) {
		this.icon = icon;
		this.place_id = place_id;
		this.scope = scope;
		this.reference = reference;
		this.geometry = geometry;
		this.opening_hours = opening_hours;
		this.id = id;
		this.photo = photo;
		this.price_level = price_level;
		this.vicinity = vicinity;
		this.name = name;
		this.rating = rating;
		this.types = types;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getPlace_id() {
		return place_id;
	}

	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	public Opening_hours getOpening_hours() {
		return opening_hours;
	}

	public void setOpening_hours(Opening_hours opening_hours) {
		this.opening_hours = opening_hours;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Photo> getPhotos() {
		return photo;
	}

	public void setPhotos(List<Photo> photo) {
		this.photo = photo;
	}

	public int getPrice_level() {
		return price_level;
	}

	public void setPrice_level(int price_level) {
		this.price_level = price_level;
	}

	public String getVicinity() {
		return vicinity;
	}

	public void setVicinity(String vicinity) {
		this.vicinity = vicinity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

}
