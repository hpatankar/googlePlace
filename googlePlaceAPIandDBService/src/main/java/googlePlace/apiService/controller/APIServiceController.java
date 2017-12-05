package googlePlace.apiService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import googlePlace.common.model.Location;
import googlePlace.common.model.PlaceRequest;
import googlePlace.common.model.PlaceResult;
import googlePlace.common.service.GooglePlacesAPI;
import googlePlace.common.service.PlaceRepository;

@RestController
@RequestMapping("/placesAPI")
public class APIServiceController {
	
private PlaceRepository placeRepository;
	
	public APIServiceController(PlaceRepository placeRepository){
		this.placeRepository = placeRepository;
	}
	
	@PostMapping("/testPlaceRequest")
	public String testPlaceRequest(@RequestBody PlaceRequest placeRequest){
		Location location = placeRequest.getLocation();
		double latitude = (location==null) ? 0 : location.getLat();		
		double longitude = (location==null) ? 0 : location.getLng();
		String ret = "";
		ret += "Location latitude " + latitude + " longitude " + longitude  + ", ";
		ret += "Radius " + placeRequest.getRadius() + ", ";
		ret += "Place Type " + placeRequest.getPlaceType() + ", ";
		ret += "Database Name " + placeRequest.getDatabaseName();
		return ret;
	}
	
	@PostMapping("/fetchPlace")
	public  ResponseEntity<PlaceResult>  fetchPlace(@RequestBody PlaceRequest placeRequest){
		PlaceResult placeResult = GooglePlacesAPI.getPlaces(placeRequest);
		// save place to database name
		// TODO delegate this function to a database manager which finds database by name
		// TODO purge the database every 30 days.
		// For now directly saving to mongo db.
		this.placeRepository.insert(placeResult);
		return new ResponseEntity<PlaceResult>(placeResult,HttpStatus.OK);
	}

}
