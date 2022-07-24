package com.practice.bike.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name = "borrow")
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long borrowId;
    private Instant borrowStart;
    private Instant borrowEnd;
    @Enumerated(EnumType.STRING)
    private BorrowStatus borrowStatus;

    @ManyToOne
    @JoinColumn(name = "bike_id")
    private Bike bike;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;


}
