package com.practice.bike.dto;

import com.practice.bike.model.BikeStatus;
import com.practice.bike.model.District;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class BikeDto {

    @Getter
    @AllArgsConstructor
    public static class Post {
        private String bikeModel;

        @Enumerated(EnumType.STRING)
        private District district;

        @Enumerated(EnumType.STRING)
        private BikeStatus bikeStatus;
    }

    @Getter
    @AllArgsConstructor
    public static class Patch {
        private Long bikeId;

        private String bikeModel;

        @Enumerated(EnumType.STRING)
        private District district;

        @Enumerated(EnumType.STRING)
        private BikeStatus bikeStatus;

        public void setBikeId(Long bikeId) {
            this.bikeId = bikeId;
        }
    }
}
