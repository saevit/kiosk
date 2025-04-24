package kiosk1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 햄버거 메뉴 리스트 정의
        String[] menuItems = {
                "ShackBurger  | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거",
                "SmokeShack   | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
                "Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
                "Hamburger    | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거"
        };

        while (true){
            System.out.println("============================");

            // 메뉴판 출력
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i=0; i< menuItems.length; i++){
                System.out.println((i+1) + ". " + menuItems[i]);
            }
            System.out.println("0. 종료          | 종료");

            // 메뉴 입력 받기
            System.out.print("원하는 메뉴를 입력하십시오: ");
            int choice = scanner.nextInt();

            // 입력 받은 메뉴에 따른 로직 출력
            if (choice == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice<=menuItems.length) {
                System.out.println("[선택된 메뉴]" + menuItems[choice-1]); // 메뉴는 1번부터 시작
            } else {
                System.out.println("존재하지 않는 상품입니다.");
            }
        }
    }
}
