package googlePlace.common.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import googlePlace.common.model.PlaceResult;

@Repository
public interface PlaceRepository extends MongoRepository<PlaceResult, String> {
}
