package com.practice.bike.controller;

import com.practice.bike.dto.MemberDto;
import com.practice.bike.mapper.MemberMapper;
import com.practice.bike.model.Member;
import com.practice.bike.repository.MemberRepository;
import com.practice.bike.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/members")
public class MemberController {

    private final MemberService memberService;
    private final MemberMapper mapper;

    public MemberController(MemberService memberService, MemberMapper mapper) {
        this.memberService = memberService;
        this.mapper = mapper;
    }

    //회원 등록
    @PostMapping
    public ResponseEntity postMember(@RequestBody MemberDto.Post postDto) {
        return new ResponseEntity<>(postDto, HttpStatus.CREATED);
    }

    //회원 수정
    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember( @PathVariable("member-id") Long id, 
                                       @RequestBody MemberDto.Patch patchDto) {
        patchDto.setId(id);
        Member member = memberService.updateMember(mapper.memberPatchDtoToMember(patchDto));
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    //회원 조회
    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id") Long id) {
        Member member = memberService.findMember(id);
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    //회원 전체 조회
    @GetMapping
    public ResponseEntity getMembers() {
        List<Member> members = memberService.findMembers();
        return new ResponseEntity<>(members, HttpStatus.OK);
    }

    //회원 삭제
    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@PathVariable("member-id") Long id) {
        memberService.deleteMember(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
