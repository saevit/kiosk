package kiosk5;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 속성
    private List<Menu> menuList;

    // 생성자
    public Kiosk (List<Menu> menuList) {
        this.menuList = menuList;
    }

    // 기능
    public void start (){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("============================");

            // 카테고리 출력
            System.out.println("[ MAIN MENU ]");
            for (int i=0; i<menuList.size(); i++) {
                System.out.println((i+1) + ". " + menuList.get(i).getName()); // 카테고리는 1번부터 시작
            }
            System.out.println("0. 종료     | 종료");

            // 카테고리 입력 받기
            System.out.print("원하는 카테고리를 입력하십시오: ");
            int choiceCategory = scanner.nextInt();

            // 카테고리 선택에 따른 출력 - 0: 종료 / 카테고리 넘버: 선택 / 그 외에: 존재하지 않음
            if (choiceCategory == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choiceCategory <= menuList.size()) {
                // 메뉴판 출력
                System.out.println("[ " + menuList.get(choiceCategory-1).getName() + " MENU ]");
                menuList.get(choiceCategory-1).printMenu(); // 카테고리는 1번부터 시작
                System.out.println("0. 뒤로가기       | 뒤로가기");
            } else {
                System.out.println("존재하지 않는 카테고리 입니다.");
                continue;
            }

            // 메뉴 입력 받기
            System.out.print("원하는 메뉴를 입력하십시오: ");
            int choiceItem = scanner.nextInt();

            // 메뉴 선택에 따른 출력 - 0: 종료 / 메뉴 넘버: 선택 / 그 외에: 존재하지 않음
            if (choiceItem == 0) {
                System.out.println("카테고리 선택으로 돌아갑니다.");
            } else if (choiceItem <= menuList.get(choiceCategory - 1).getMenuSize()) {
                menuList.get(choiceCategory-1).printSelectedMenu(choiceItem); // 메뉴는 1번부터 시작
            } else {
                System.out.println("존재하지 않는 상품입니다.");
            }
        }
    }
}
