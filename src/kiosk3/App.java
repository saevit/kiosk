package kiosk3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 햄버거 메뉴 리스트 정의
        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Kiosk kiosk = new Kiosk(menuItems);

//        while (true) {
//            System.out.println("============================");
//
//            // 메뉴판 출력
//            System.out.println("[ SHAKESHACK MENU ]");
//            for (int i = 0; i < menuItems.size(); i++) {
//                System.out.println((i + 1) + ". " + menuItems.get(i));
//            }
//            System.out.println("0. 종료          | 종료");
//
//            // 메뉴 입력 받기
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("원하는 메뉴를 입력하십시오: ");
//            int choice = scanner.nextInt();
//
//            // 입력 받은 메뉴에 따른 로직 출력
//            if (choice == 0) {
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            } else if (choice <= menuItems.size()) {
//                System.out.println("[선택된 메뉴]" + menuItems.get(choice - 1)); // 메뉴는 1번부터 시작
//            } else {
//                System.out.println("존재하지 않는 상품입니다.");
//            }
//        }
    }
}
