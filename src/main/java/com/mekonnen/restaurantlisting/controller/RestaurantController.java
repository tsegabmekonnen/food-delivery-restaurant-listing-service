package com.mekonnen.restaurantlisting.controller;

import com.mekonnen.restaurantlisting.dto.RestaurantDTO;
import com.mekonnen.restaurantlisting.service.RestaurantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class RestaurantController {

    @Autowired
    RestaurantServiceImpl restaurantServiceImpl;

    @GetMapping("/fetchAllRestaurants")
    public ResponseEntity<List<RestaurantDTO>> fetchAllRestaurants(){
        List<RestaurantDTO> allRestaurants = restaurantServiceImpl.findAllRestaurants();
        return new ResponseEntity<>(allRestaurants, HttpStatus.OK);
    }

    @PostMapping("/addRestaurant")
    public ResponseEntity<RestaurantDTO> saveRestaurant(@RequestBody RestaurantDTO restaurantDTO) {
        RestaurantDTO restaurantAdded = restaurantServiceImpl.addRestaurantInDB(restaurantDTO);
        return new ResponseEntity<>(restaurantAdded, HttpStatus.CREATED);
    }

    @GetMapping("fetchById/{id}")
    public ResponseEntity<RestaurantDTO> findRestaurantById(@PathVariable Integer id) {
        RestaurantDTO restauranFetched = restaurantServiceImpl.fetchRestaurantById(id);
        return new ResponseEntity<RestaurantDTO>(restauranFetched, HttpStatus.OK);
    }

}
