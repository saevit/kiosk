package kiosk6;

public class Cart {
    // 속성 - MenuItem (메뉴명, 가격 정보), 수량
    MenuItem menuItem;
    int quantity;

    // 생성자
    Cart (MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    // 기능
    MenuItem getMenuItem() { return this.menuItem; }

    @Override
    public String toString() {
        return menuItem.getName() + "  W " + menuItem.getPrice() + "  ×" + quantity;
    }
}