package kiosk4;

import java.util.List;

public class Menu {
    // 속성 - 메뉴의 카테고리 이름, 메뉴를 담은 리스트
    String name;
    List<MenuItem> menu;

    // 생성자
    public Menu (String name, List<MenuItem> menu) {
        this.name = name;
        this.menu = menu;
    }

    // 기능
    // 카테고리 이름 출력
    public String getName() {
        return name;
    }

    // 메뉴 전체 출력
    void printMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i)); // 메뉴는 1번부터 시작
        }
    }

    // 선택한 메뉴만 출력
    void printSelectedMenu(int choice) {
        System.out.println("[선택된 메뉴]" + menu.get(choice - 1)); // 메뉴는 1번부터 시작
    }


}
