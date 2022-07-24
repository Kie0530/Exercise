package com.practice.bike.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "bike")
@NoArgsConstructor
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bikeId;
    private String bikeModel;
    @Enumerated(EnumType.STRING)
    private District district;

    @Enumerated(EnumType.STRING)
    private BikeStatus bikeStatus;

    @OneToMany(mappedBy = "bike", cascade = CascadeType.ALL)
    private List<Borrow> borrowList;

    public Bike(Long bikeId, String bikeModel, District district, BikeStatus bikeStatus) {
        this.bikeId = bikeId;
        this.bikeModel = bikeModel;
        this.district = district;
        this.bikeStatus = bikeStatus;
    }
}
