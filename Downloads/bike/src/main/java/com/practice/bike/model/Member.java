package com.practice.bike.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "member")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    @Enumerated(EnumType.STRING)
    private MemberStatus memberStatus;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Borrow> borrowList;

    public Member(Long id, String name, String phone, MemberStatus memberStatus) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
}
