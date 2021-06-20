package one.suzamax.demo.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import one.suzamax.demo.models.Car;
import one.suzamax.demo.repositories.CarRepository;


public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/cars")
    public List<Car> getAllCars() {
	return carRepository.findAll();
    }

    @GetMapping("/cars/{id}")
    public ResponseEntity<Car> getCarsById(@PathVariable(value = "id") Long carId) throws Exception {
	Car car = carRepository.findById(carId).orElseThrow(() -> new Exception("Car not found on :: " + carId));
	return ResponseEntity.ok().body(car);
    }

    // Create new cars
    @PostMapping("/cars")
    public Car createCar(@RequestBody Car car) {
	return carRepository.save(car);
    }

    // Update a car
    @PutMapping("/cars/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable(value = "id") Long carId,
					 @RequestBody Car carDetails) throws Exception {
	Car car = carRepository.findById(carId).orElseThrow(() -> new Exception("Car not found on :: " + carId));
	car.setCar_make(carDetails.getCar_make());
	car.setCar_model(carDetails.getCar_model());
	car.setCar_year(carDetails.getCar_year());
	car.setOwner_id(carDetails.getOwner_id());
	final Car updatedCar = carRepository.save(car);
	return ResponseEntity.ok(updatedCar);
    }

    // DELETE
    @DeleteMapping("/cars/{id}")
    public Map<String, Boolean> deleteCar(@PathVariable(value = "id") Long carId) throws Exception {
	Car car =
	    carRepository
	    .findById(carId)
	    .orElseThrow(() -> new Exception("Car not found on :: " + carId));
	carRepository.delete(car);
	Map<String, Boolean> response = new HashMap<>();
	response.put("deleted", Boolean.TRUE);
	return response;
    }
}
