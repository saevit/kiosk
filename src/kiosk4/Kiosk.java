package kiosk4;

import java.util.Scanner;

public class Kiosk {
    // 속성
    Menu menu;

    // 생성자
    public Kiosk (Menu menu) {
        this.menu = menu;
    }

    // 기능
    public void start (){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("============================");

            // 메뉴판 출력
            menu.printMenu();

            // 메뉴 입력 받기
            System.out.print("원하는 메뉴를 입력하십시오: ");
            int choice = scanner.nextInt();

            // 입력 받은 메뉴에 따른 로직 출력
            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice <= 4) {
                menu.getMenu(choice); // 메뉴는 1번부터 시작
            } else {
                System.out.println("존재하지 않는 상품입니다.");
            }
        }
    }
}
