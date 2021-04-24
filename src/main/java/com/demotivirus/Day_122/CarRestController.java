package com.demotivirus.Day_122;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarRestController {
    @Autowired
    private CarService carService;

    /**
     * Get all cars list.
     *
     * @return the list
     */
    @GetMapping("cars")
    public List<Car> findAll() {
        return carService.findAll();
    }

    /**
     * Gets cars by id.
     *
     * @param carId the car id
     * @return the cars by id
     * @throws ResourceNotFoundException the resource not found exception
     */
    @GetMapping("cars/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable(value = "id") Long carId) {
        Car car = carService.findById(carId).orElseThrow(() ->
                new ResourceNotFoundException("Car " + carId + " not found")
        );
        return ResponseEntity.ok().body(car);
    }
}
