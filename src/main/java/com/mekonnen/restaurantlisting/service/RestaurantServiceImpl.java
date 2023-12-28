package com.mekonnen.restaurantlisting.service;

import com.mekonnen.restaurantlisting.dto.RestaurantDTO;
import com.mekonnen.restaurantlisting.entity.Restaurant;
import com.mekonnen.restaurantlisting.mapper.RestaurantMapper;
import com.mekonnen.restaurantlisting.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    @Override
    public List<RestaurantDTO> findAllRestaurants() {
        List<Restaurant> restaurants = restaurantRepo.findAll();
        List<RestaurantDTO> restaurantDTOList = restaurants.stream().map((restaurant ->
                RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurant))).collect(Collectors.toList());
        return restaurantDTOList;
    }

    @Override
    public RestaurantDTO addRestaurantInDB(RestaurantDTO restaurantDTO) {
        return null;
    }

    @Override
    public RestaurantDTO fetchRestaurantById(Integer id) {
        return null;
    }
}
