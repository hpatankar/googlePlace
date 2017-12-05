package googlePlace.common.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import googlePlace.common.model.Geometry;
import googlePlace.common.model.Location;
import googlePlace.common.model.Northeast;
import googlePlace.common.model.Opening_hours;
import googlePlace.common.model.Photo;
import googlePlace.common.model.PlaceResult;
import googlePlace.common.model.Result;
import googlePlace.common.model.Southwest;
import googlePlace.common.model.Viewport;
import googlePlace.common.utils.TestPlaceResultGenerator;

@Component
public class DbTestData implements CommandLineRunner{
	private PlaceRepository placeRepository;
	
	public DbTestData(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
	}
	@Override
	public void run(String...strings) throws Exception{
		
		// generate sample result
		PlaceResult sampleOne = TestPlaceResultGenerator.generateTestResultObject();
		
	    // drop all places
	    this.placeRepository.deleteAll();

	    //add created places to the database
	    List<PlaceResult> placeResults = Arrays.asList(sampleOne);
	    this.placeRepository.save(placeResults);
	}
}
