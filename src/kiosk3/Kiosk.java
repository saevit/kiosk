package kiosk3;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.List;

public class Kiosk {
    // 속성
    List<MenuItem> menuItems;

    // 생성자
    public Kiosk (List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // 기능
    public void start (){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("============================");

            // 메뉴판 출력
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println((i + 1) + ". " + menuItems.get(i));
            }
            System.out.println("0. 종료          | 종료");

            // 메뉴 입력 받기
            System.out.print("원하는 메뉴를 입력하십시오: ");
            int choice = scanner.nextInt();

            // 입력 받은 메뉴에 따른 로직 출력
            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice <= menuItems.size()) {
                System.out.println("[선택된 메뉴]" + menuItems.get(choice - 1)); // 메뉴는 1번부터 시작
            } else {
                System.out.println("존재하지 않는 상품입니다.");
            }
        }
    }
}
