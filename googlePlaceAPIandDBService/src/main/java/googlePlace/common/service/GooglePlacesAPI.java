package googlePlace.common.service;

import org.springframework.web.client.RestTemplate;

import googlePlace.common.model.Location;
import googlePlace.common.model.PlaceRequest;
import googlePlace.common.model.PlaceResult;

public class GooglePlacesAPI {

	private static final String API_KEY = "AIzaSyDien9SJQghXEJLvT80DCJaDc2NN0LYxec ";
	
	public static PlaceResult getPlaces(PlaceRequest placeRequest){
		RestTemplate restTemplate = new RestTemplate();
		Location location = placeRequest.getLocation();
		double latitude = (location==null) ? 0 : location.getLat();		
		double longitude = (location==null) ? 0 : location.getLng();
		String url = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="
				+ latitude
				+ ","
				+ longitude
				+ "&radius="
				+ placeRequest.getRadius()
				+ "&type="
				+ placeRequest.getPlaceType()
				+ "&key="
				+ GooglePlacesAPI.API_KEY;
		PlaceResult placeResult = restTemplate.getForObject(url, PlaceResult.class);
		return placeResult;
	}
}
