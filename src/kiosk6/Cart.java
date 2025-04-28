package kiosk6;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    // 속성 - MenuItem (메뉴명, 가격 정보), 수량
    MenuItem menuItme;
    int quantity;

    // 생성자
    Cart (MenuItem menuItme, int quantity) {
        this.menuItme = menuItme;
        this.quantity = quantity;
    }

    // 기능
//    @Override
//    public String toString() {
//        return menuItme.getName() + "  W " + menuItme.getPrice() + "  ×" + quantity;
//    }
}