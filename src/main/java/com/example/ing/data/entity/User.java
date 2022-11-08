package com.example.ing.data.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="User")
public class User {
    //유저 코드(PK)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long USER_CD;
    //유저 이름
    @Column(nullable = false)
    private String USER_NM;
    //유저 닉네임
    @Column(nullable = false)
    private String USER_NKNM;
    //Dummy1
    @Column
    private String DUMMY1;
    //Dummy2
    @Column
    private String DUMMY2;
    //Dummy3
    @Column
    private String DUMMY3;
    //유저의 비밀번호
    @Column(nullable = false)
    private String USER_PW;
    //유저의 덕성 이메일
    @Column(nullable = false)
    private String USER_EM;
    //생성 날짜
    private LocalDateTime CREATE_DATE;
    //유저의 속성 여부
    @Column(nullable = false)
    private Integer User_ID;
}
