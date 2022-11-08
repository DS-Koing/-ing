package com.example.ing.data.entity;

import javax.persistence.*;

@Entity
@Table(name="Order")
public class Order {
    //주문서 코드(PK)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ORDER_CD;
    //장바구니 코드(FK)
    //@Column(nullable = false)
    //private Long CART_CD;
    //Dummy1
    @Column
    private String DUMMY1;
    //Dummy2
    @Column
    private String DUMMY2;
    //Dummy3
    @Column
    private String DUMMY3;

}
