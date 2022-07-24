package com.practice.bike.controller;

import com.practice.bike.dto.BikeDto;
import com.practice.bike.mapper.BikeMapper;
import com.practice.bike.model.Bike;
import com.practice.bike.model.District;
import com.practice.bike.service.BikeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/bikes")
public class BikeController {

    private final BikeService bikeService;
    private final BikeMapper mapper;

    public BikeController(BikeService bikeService, BikeMapper mapper) {
        this.bikeService = bikeService;
        this.mapper = mapper;
    }

    // 자전거 등록
    @PostMapping
    public ResponseEntity postBike(@RequestBody BikeDto.Post postBikeDto) {
        Bike bike = bikeService.createBike(mapper.bikePostDtoToBike(postBikeDto));
        return new ResponseEntity<>(bike, HttpStatus.CREATED);
    }

    // 자전거 수정
    @PatchMapping("/{bike-id}")
    public ResponseEntity patchBike(@PathVariable("bike-id") Long bikeId,
                                    @RequestBody BikeDto.Patch patchBikeDto) {
        patchBikeDto.setBikeId(bikeId);
        Bike bike = bikeService.updateBike(mapper.bikePatchDtoToBike(patchBikeDto));
        return new ResponseEntity<>(bike, HttpStatus.OK);
    }

    // 자전거 조회
    @GetMapping("/{bike-id}")
    public ResponseEntity getBike(@PathVariable("bike-id") Long bikeId) {
        Bike bike = bikeService.findBike(bikeId);
        return new ResponseEntity<>(bike, HttpStatus.OK);
    }
    // 자전거 자치구 조회
    @GetMapping("/{district}")
    public ResponseEntity getBike(@PathVariable("district") District district) {
        List<Bike> bikeByDistrict = bikeService.findBikeByDistrict(district);
        return new ResponseEntity<>(bikeByDistrict, HttpStatus.OK);
    }

    // 자전거 전체 조회
    @GetMapping
    public ResponseEntity getBikes(){
        List<Bike> bikes = bikeService.findAllBikes();
        return new ResponseEntity<>(bikes, HttpStatus.OK);
    }

    // 자전거 삭제
    @DeleteMapping("/{bike-id}")
    public ResponseEntity deleteBike(@PathVariable("bike-id") Long bikeId) {
        bikeService.deleteBike(bikeId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
