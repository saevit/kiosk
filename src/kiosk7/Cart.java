package kiosk7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Cart {
    // 속성
    private List<CartItem> cart;
    private int totalPrice;

    // 생성자
    Cart() {
        cart = new ArrayList<>();
        totalPrice = 0;
    }

    // 기능
    int getSize() {
        return cart.size();
    }

    // 장바구니에 추가
    void addItem(MenuItem item) {
        // 이미 장바구니에 있다면 수량을 늘림
        boolean isExist = false;
        for (CartItem c : cart) {
            if (c.getMenuItem().equals(item)) {
                c.addQuantity(1);
                isExist = true;
            }
        }

        // 장바구니에 없다면 새롭게 추가
        if (isExist == false) {
            cart.add(new CartItem(item, 1));
        }

        // 현재까지 총 주문 금액 합산
        totalPrice += item.getPrice();
    }

    // 장바구니 주문
    void orders(Discount discountType) {
        int price = (int) (totalPrice * (1 - discountType.getDiscountRate()));
        System.out.println("주문이 완료되었습니다. 주문 금액은 W" + price + "입니다.");
        totalPrice = 0;
        cart.clear();
    }

    // 장바구니 항목 삭제
    void cancle(int index) {
        System.out.println(cart.get(index) + "가 취소 되었습니다.");
        totalPrice -= cart.get(index).getMenuItem().getPrice();
        cart.remove(index);
    }

    void cancleWithName(String menuName) {
        int index = IntStream.range(0, cart.size())
                .filter(i -> cart.get(i).getMenuItem().getName().equals(menuName))
                .findFirst()
                .orElse(-1); // 없으면 -1 반환

        if (index == -1) {
            System.out.println("장바구니에 해당 메뉴가 존재하지 않습니다.");
        } else {
            cancle(index);
        }
    }

    // 장바구니 전체 삭제
    void cancleAll() {
        System.out.println("전체 취소 되었습니다.");
        totalPrice = 0;
        cart.clear();
    }

    void printOrders() {
        System.out.println("[ Orders ]");
        for (CartItem c : cart) {
            System.out.println(c);
        }
    }

    void printOrdersWithNumbers(){
        System.out.println("[ Orders ]");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i + 1) + ". " + cart.get(i)); // 메뉴는 1번부터 시작
        }
    }

    void printTotalPrice() {
        System.out.println("[ Total ]");
        System.out.println("W " + totalPrice);
    }
}
