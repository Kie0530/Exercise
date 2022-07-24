package com.practice.bike.mapper;

import com.practice.bike.dto.MemberDto;
import com.practice.bike.model.Member;
import org.springframework.stereotype.Component;

@Component
public class MemberMapper {

    public Member memberPostDtoToMember(MemberDto.Post postDto) {
        return new Member(0L,
                postDto.getName(),
                postDto.getPhone(),
                postDto.getMemberStatus());
    }

    public Member memberPatchDtoToMember(MemberDto.Patch patchDto) {
        return new Member(patchDto.getId(),
                patchDto.getName(),
                patchDto.getPhone(),
                patchDto.getMemberStatus());
    }
}
