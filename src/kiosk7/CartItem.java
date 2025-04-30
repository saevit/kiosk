package kiosk7;

public class CartItem {
    // 속성 - MenuItem (메뉴명, 가격 정보), 수량
    private MenuItem menuItem;
    private int quantity;

    // 생성자
    CartItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    // 기능
    MenuItem getMenuItem() { return this.menuItem; }

    void addQuantity(int num) { quantity += num; }

    @Override
    public String toString() {
        return menuItem.getName() + "  W " + menuItem.getPrice() + "  ×" + quantity;
    }
}