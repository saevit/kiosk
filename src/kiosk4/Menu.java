package kiosk4;

import java.util.List;

public class Menu {
    // 속성
    List<MenuItem> burgers;

    // 생성자
    public Menu (List<MenuItem> burgers) {
        this.burgers = burgers;
    }

    // 기능
    void printMenu () {
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < burgers.size(); i++) {
            System.out.println((i + 1) + ". " + burgers.get(i)); // 메뉴는 1번부터 시작
        }
        System.out.println("0. 종료          | 종료");
    }

    void getMenu (int choice) {
        System.out.println("[선택된 메뉴]" + burgers.get(choice - 1)); // 메뉴는 1번부터 시작
    }


}
