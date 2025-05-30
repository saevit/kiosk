package kiosk6;

public class MenuItem {
    // 속성 - 이름, 가격, 설명
    private String name;
    private int price;
    private String info;

    // 생성자
    public MenuItem (String name, int price, String info){
        this.name = name;
        this.price = price;
        this.info = info;
    }

    //기능
    String getName() { return this.name; }

    int getPrice() { return this.price; }

    @Override
    public String toString() {
        return String.format("%-12s | W %d | %s", name, price, info);
    }
}