package com.mekonnen.restaurantlisting.service;

import com.mekonnen.restaurantlisting.dto.RestaurantDTO;

import java.util.List;

public interface RestaurantService {

    public List<RestaurantDTO> findAllRestaurants();
    public RestaurantDTO addRestaurantInDB(RestaurantDTO restaurantDTO);
    public RestaurantDTO fetchRestaurantById( Integer id);
}
