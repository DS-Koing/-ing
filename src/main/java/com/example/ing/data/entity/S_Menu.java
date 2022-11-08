package com.example.ing.data.entity;

import javax.persistence.*;

@Entity
@Table(name="S_Menu")
public class S_Menu {
    //음식 코드(PK)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SMENU_CD;
    //메뉴 코드(FK)
    //@Column(nullable = false)
    //private Long MENU_CD;
    //Dummy1
    @Column
    private String DUMMY1;
    //Dummy2
    @Column
    private String DUMMY2;
    //Dummy3
    @Column
    private String DUMMY3;
    //음식 가격
    @Column(nullable = false)
    private Long SMENU_PR;
    //음식 이름
    @Column(nullable = false)
    private String SMENU_NM;
    //음식 개수
    @Column(nullable = false)
    private Integer SMENU_CH;
}
