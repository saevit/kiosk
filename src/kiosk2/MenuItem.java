package kiosk2;

public class MenuItem {
    // 속성 - 이름, 가격, 설명
    String name;
    int price;
    String info;

    // 생성자
    public MenuItem (String name, int price, String info){
        this.name = name;
        this.price = price;
        this.info = info;
    }

    //기능
    @Override
    public String toString() {
        return String.format("%-12s | W %d | %s", name, price, info);
    }
}
