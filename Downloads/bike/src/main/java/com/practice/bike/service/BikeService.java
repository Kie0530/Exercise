package com.practice.bike.service;

import com.practice.bike.model.Bike;
import com.practice.bike.model.District;
import com.practice.bike.repository.BikeRepository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class BikeService {
    private final BikeRepository bikeRepository;

    public BikeService(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    // 자전거 등록
    public Bike createBike(Bike bike) {
        Bike savedBike = bikeRepository.save(bike);
        return savedBike;
    }

    // 자전거 수정
    public Bike updateBike(Bike bike) {
        Bike updatedBike = bike;
        return updatedBike;
    }

    // 자전거 조회
    public Bike findBike(Long bikeId) {
        Optional<Bike> optionalBike = bikeRepository.findById(bikeId);
        Bike foundBike = optionalBike.get();
        return foundBike;
    }

    // 자전거 자치구 조회
    public List<Bike> findBikeByDistrict(District district) {
        List<Enum> districtValues = new ArrayList<Enum>(EnumSet.allOf(District.class));
        List<String> districtNames = Stream.of(District.values())
                                    .map(District::name)
                                    .collect(Collectors.toList());
        if(!districtNames.contains(district)) {
            throw new RuntimeException(
                    "올바른 자치구 이름이 아닙니다."
            );
        }
        List<Bike> foundBikes = bikeRepository.findAll().stream()
                                .filter(bike -> bike.getDistrict() == district).collect(Collectors.toList());
        return foundBikes;

    }

    // 자전거 전체 조회
    public List<Bike> findAllBikes() {
        List<Bike> bikes = bikeRepository.findAll();
        return bikes;
    }

    // 자전거 삭제
    public void deleteBike(Long bikeId) {
        bikeRepository.deleteById(bikeId);
    }
}
