# googlePlace
This demo gets results from the Google places and saves it to a MongoDB database. The request is passed as a Json Object.
Step 1 – Empty local  mongo database	
 
Step 2 Json request set for Federation Square (Australian version of Times Square) in Melbourne.
http://localhost:8080/placesAPI/fetchPlace

 
 
Results 
 

Results saved to database
localhost:8080/placesdb/all
 
 
Results in Mongo
 

Further possible improvements.
1)	Database can be selected by name passed in places request instead of hardcoded MongoDB. A database manage class would get the database connection by name. 
2)	Better organisation and abstraction of classes.
3)	Use of events. The “APIServiceController” directly saves object to the database. This can be handled better.
4)	A more elegant alternative if possible to building the URL string.
5)	Implementation of unit tests.
6)	In the longer run, creating an Angular 4 front end. It will work as follows
- User clicks a point on the map.
- First call made to the database service to see if data is fresh (< 24 hours)
- If data is stale, delete stale data from database and call to API service for fresh data.
- Place results get rendered as thumbnails, when clicked detail result displayed.

