package com.example.ing.data.repository;
// Spring Data JPA가 제공하는 인터페이스
// 엔터티가 생성한 데이터베이스에 접근하는 데 사용됨

import com.example.ing.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
