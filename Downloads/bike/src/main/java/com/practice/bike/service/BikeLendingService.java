package com.practice.bike.service;

import com.practice.bike.repository.BikeRepository;
import com.practice.bike.repository.BorrowRepository;
import com.practice.bike.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class BikeLendingService {
    private final MemberRepository memberRepository;
    private final BikeRepository bikeRepository;
    private final BorrowRepository borrowRepository;

    public BikeLendingService(MemberRepository memberRepository, BikeRepository bikeRepository, BorrowRepository borrowRepository) {
        this.memberRepository = memberRepository;
        this.bikeRepository = bikeRepository;
        this.borrowRepository = borrowRepository;
    }

}
