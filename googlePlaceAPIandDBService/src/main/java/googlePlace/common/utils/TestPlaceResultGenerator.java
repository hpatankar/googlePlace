package googlePlace.common.utils;

import java.util.Arrays;
import java.util.List;

import googlePlace.common.model.Geometry;
import googlePlace.common.model.Location;
import googlePlace.common.model.Northeast;
import googlePlace.common.model.Opening_hours;
import googlePlace.common.model.Photo;
import googlePlace.common.model.PlaceResult;
import googlePlace.common.model.Result;
import googlePlace.common.model.Southwest;
import googlePlace.common.model.Viewport;

public class TestPlaceResultGenerator {
	public static PlaceResult generateTestResultObject(){
		List<String> html_attributions;
		List<Result> results;
		List<Photo> photos;
		List<String> types;
		// setting sample one
		// html_attributions
		html_attributions = Arrays.asList("attribute1_1","attribute1_2","attribute1_3");
		// results
		Photo photo1 = new Photo("CmRaAAAAcFIlmwCVdJC_UfOcXMIwG9KMFr168drBecYqPwwWfvZldwQIDrmfS0wwWapz9Yecw3ozPC8j53U7KUicm8aL6sO4qqA99C8i43Ae2aLNA15wgr4aI_EefMZ4gmMylW_-EhCq14r6eCPW9qqPiaE9jvKJGhTSel020PnY27AeQ3uMXwHnTN8vYA", 
				Arrays.asList("<a href=\"https://maps.google.com/maps/contrib/114727320476039103791/photos\">The Little Snail Restaurant</a>"), 
				900,
				1350);
		photos = Arrays.asList(photo1);
		
		
		Result result = new Result(
				"https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png", 
				"ChIJtwapWjeuEmsRcxV5JARHpSk", 
				"GOOGLE", 
				"CmRRAAAARMjUEBCB79562XG-kH7Y7lchGg8-tZP-FOlQfybQ54uGmz1tg8CT22SKwQ-QK6FZ6EbuHMIO3_eG-zjOWuYJZWpBaWy6YsVaVVECO2uEOga-I9c9X06kh57OqbEyj8BFEhDqQzFweScHYBYkhIxUZMPqGhThRF4gT9nucIzNdzcranbf5IJguw", 
				new Geometry(new Location(-33.87036190000001, 151.1978505),
						new Viewport(new Northeast(-33.8690182697085, 151.1991515302915), new Southwest(-33.8717162302915, 151.1964535697085))), 
				new Opening_hours("false", Arrays.asList("Mon","Tue")), 
				"e58f0f9ecaf15ab719d305b93265cafc00b01a3f", 
				photos, 
				2, 
				"3/50 Murray Street, Pyrmont", 
				"The Little Snail Restaurant", 
				4.3, 
				Arrays.asList("restaurant","food","point_of_interest", "establishment"));
				
		results = Arrays.asList(result);
		PlaceResult placeResult = new PlaceResult(
												"CqQCGwEAANT23jEsDWcMfhB-Sp4GQ9dcWyaQPzMJjbZH4JPflhLwrpthAxYGBUBKq8Iv_LeKwqpxUYNQOMLh7uwGwsn30bY2T2-tnaxk7Jh1mJOrX65ANq6RV6-UyniENaBF4W095Ms055c7V0MsQ2KyrUEgTAYdInYicxEEu0sewBTePcNJxZfBXEFuWJJWaSHYI2uBjw1A-EXPjTpmMGYaFKHI_loBLezu71U33MiDe0MgsUFVUwQvS5xaw9pOubdo8UC3FiwzWYfsXxMbh3mt8r6SIMQtjzujNzgdbyI-cavPyXQsJEj8EwHVe8rz__Rrr1EhVjRiPQt0qyioNhZO8UEKfpSN2NO2RWxzZsF1Byzab9qc1_rWu8nP3gzyeXP4k6aTOxIQve-20VnjgW11h3MKdqTrAhoUJucAn14J3aDvVNIowX_RWnwGU1Y", 
												results, 
												html_attributions, 
												"OK");
		return placeResult;
	}
}
