package study.ch20.Ex;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
//### 문제 7. Product 리스트 — 장바구니
//
//`Product` 클래스(name, price, quantity)를 만들고 장바구니 기능을 구현하시오.
//
//- 상품 3개를 리스트에 추가
//- 총 금액 계산 (price × quantity의 합)
//- 가장 비싼 상품 이름 출력
//
// 데이터: 노트북(1200000, 1), 마우스(35000, 2), 키보드(55000, 1)
// 총 금액: 1,325,000원
// 가장 비싼 상품: 노트북

@Data
@Builder
class Product {
    private String name;
    private int price;
    private int quantity;
}

public class Ex09 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.addAll(List.of(
            Product.builder().name("노트북").price(1200000).quantity(1).build(),
            Product.builder().name("마우스").price(35000).quantity(2).build(),
            Product.builder().name("키보드").price(55000).quantity(1).build()
        ));

        System.out.println("데이터 :" + productList);




    }
}
