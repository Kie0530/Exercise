package com.practice.bike.service;

import com.practice.bike.model.Member;
import com.practice.bike.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // 회원 등록
    public Member createMember(Member member) {
        return memberRepository.save(member);
    }
    // 회원 수정
    public Member updateMember(Member member) {
        Member updatedMember = member;
        return updatedMember;
    }

    // 회원 조회
    public Member findMember(Long id) {
        Optional<Member> foundMember = memberRepository.findById(id);
        Member member = foundMember.get();
        return member;
    }
    // 회원 전체 조회
    public List<Member> findMembers() {
        List<Member> members = memberRepository.findAll();
        return members;
    }

    // 회원 삭제
    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }
}
