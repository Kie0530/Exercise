package com.practice.bike.dto;


import com.practice.bike.model.MemberStatus;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class MemberDto {

    @Getter
    @AllArgsConstructor
    public static class Post {
        
        @NotNull
        private String name;
        
        @NotNull
//        @Pattern(regexp = "^010-\\d{3,4}-\\d{4}$",
//                message = "휴대폰 번호는 010으로 시작하는 11자리 숫자와 '-'로 구성되어야 합니다.")
        private String phone;

        @Enumerated(EnumType.STRING)
        private MemberStatus memberStatus;
    }

    @Getter
    @AllArgsConstructor
    public static class Patch {

        private Long id;

        @NotNull
        private String name;

//        @Pattern(regexp = "^010-\\d{3,4}-\\d{4}$",
//                message = "휴대폰 번호는 010으로 시작하는 11자리 숫자와 '-'로 구성되어야 합니다")
        private String phone;

        @Enumerated(EnumType.STRING)
        private MemberStatus memberStatus;

        public void setId(Long id) {
            this.id = id;
        }
    }

}
