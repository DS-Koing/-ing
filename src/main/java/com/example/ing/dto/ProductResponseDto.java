package com.example.ing.dto;
// 확인용 Product
// DAO 연동을 위한 컨트롤러와 서비스 설계 (Product)
// 서비스 클래스
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductResponseDto {
    private Long number;

    private String name;

    private int price;

    private int stock;

    public Long getNUmber(){
        return number;
    }
    public void setNumber(Long number){
        this.number = number;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
}
