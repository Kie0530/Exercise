package com.practice.bike.mapper;

import com.practice.bike.dto.BikeDto;
import com.practice.bike.model.Bike;
import org.springframework.stereotype.Component;

@Component
public class BikeMapper {

    public Bike bikePostDtoToBike(BikeDto.Post postBike) {
        return new Bike(0L,
                postBike.getBikeModel(),
                postBike.getDistrict(),
                postBike.getBikeStatus());
    }

    public Bike bikePatchDtoToBike(BikeDto.Patch patchBike) {
        return new Bike(patchBike.getBikeId(),
                patchBike.getBikeModel(),
                patchBike.getDistrict(),
                patchBike.getBikeStatus());
    }

}
