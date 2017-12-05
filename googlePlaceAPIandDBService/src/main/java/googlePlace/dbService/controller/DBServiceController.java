package googlePlace.dbService.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import googlePlace.common.model.PlaceResult;
import googlePlace.common.service.PlaceRepository;

@RestController
@RequestMapping("/placesdb")
public class DBServiceController {
	private PlaceRepository placeRepository;
	
	public DBServiceController(PlaceRepository placeRepository){
		this.placeRepository = placeRepository;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<PlaceResult>> getAll(){
		return new ResponseEntity<List<PlaceResult>>(this.placeRepository.findAll(),HttpStatus.OK);
	}
	
	@PutMapping
	public void insert(@RequestBody PlaceResult placeResult){
		this.placeRepository.insert(placeResult);
	}
	
	@PostMapping
	public void update(@RequestBody PlaceResult placeResult){
		this.placeRepository.save(placeResult);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id){
		this.placeRepository.delete(id);
	}

}
