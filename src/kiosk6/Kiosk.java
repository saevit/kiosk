package kiosk6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 속성
    private List<Menu> menuList;
    private List<Cart> cartList;
    int totalPrice;

    // 생성자
    public Kiosk (List<Menu> menuList) {
        this.menuList = menuList;
    }

    // 기능
    public void start (){
        Scanner scanner = new Scanner(System.in);

        // 새 장바구니 생성
        cartList = new ArrayList<>();
        totalPrice = 0;

        while (true) {
            System.out.println("============================");

            // 카테고리 출력
            System.out.println("[ MAIN MENU ]");
            for (int i=0; i<menuList.size(); i++) {
                System.out.println((i+1) + ". " + menuList.get(i).getName()); // 카테고리는 1번부터 시작
            }
            System.out.println("0. 종료     | 종료");

            // + 장바구니 카테고리 출력
            if (cartList.size() > 0) {
                System.out.println("\n[ ORDER MENU ]");
                System.out.println((menuList.size()+1) + ". Orders  | 장바구니를 확인 후 주문합니다.");
                System.out.println((menuList.size()+2) + ". Cancel  | 진행중인 주문을 취소합니다.");
            }

            // 카테고리 입력 받기
            System.out.print("원하는 카테고리를 입력하십시오: ");
            int choiceCategory = scanner.nextInt();

            // 카테고리 선택에 따른 출력 - 0: 종료 / 카테고리 넘버: 선택
            // + 장바구니 카테고리 넘버: 주문, 취소
            // 그 외에: 존재하지 않음
            if (choiceCategory == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if (choiceCategory <= menuList.size()) {
                // 메뉴판 출력
                System.out.println("\n[ " + menuList.get(choiceCategory-1).getName() + " MENU ]");
                menuList.get(choiceCategory-1).printMenu(); // 카테고리는 1번부터 시작
                System.out.println("0. 뒤로가기       | 뒤로가기");
            }
            else if ((cartList.size() > 0) && (choiceCategory == menuList.size()+1)) {
                // 장바구니 주문
                // 주문 내역 및 총 금액 출력
                System.out.println("[ Orders ]");
                for (Cart c : cartList) {
                    System.out.println(c);
                }
                System.out.println("[ Total ]");
                System.out.println("W " + totalPrice);

                // 주문 여부 확인
                System.out.println("1. 주문        2. 뒤로가기");
                int choiceOrder = scanner.nextInt();

                if (choiceOrder == 1) {
                    System.out.println("주문이 완료되었습니다.");
                    cartList.clear();
                }
                continue;
            }
            else if ((cartList.size() > 0) && (choiceCategory == menuList.size()+2)) {
                // 장바구니 주문 취소
                // 주문 내역 및 총 금액 출력
                System.out.println("[ Orders ]");
                for (int i = 0; i < cartList.size(); i++) {
                    System.out.println((i + 1) + ". " + cartList.get(i)); // 메뉴는 1번부터 시작
                }
                System.out.println((cartList.size()+1) + ". 전체삭제");
                System.out.println("0. 뒤로가기");

                // 취소 여부 확인
                System.out.println("어떤 항목을 취소하겠습니까?");
                int choiceCancle = scanner.nextInt();

                if (choiceCancle == 0) {
                    System.out.println("카테고리 선택으로 돌아갑니다.");
                }
                else if (choiceCancle <= cartList.size()) {
                    System.out.println(cartList.get(choiceCancle-1) + "가 취소 되었습니다.");
                    cartList.remove(choiceCancle-1);
                }
                else if (choiceCancle == cartList.size()+1) {
                    System.out.println("전체 취소 되었습니다.");
                    cartList.clear();
                }
                else {
                    System.out.println("존재하지 않는 항목입니다.");
                }

                continue;
            }
            else {
                System.out.println("존재하지 않는 카테고리입니다.");
                continue;
            }

            // 메뉴 입력 받기
            System.out.print("원하는 메뉴를 입력하십시오: ");
            int choiceItem = scanner.nextInt();

            // 메뉴 선택에 따른 출력 - 0: 종료 / 메뉴 넘버: 선택 / 그 외에: 존재하지 않음
            if (choiceItem == 0) {
                System.out.println("카테고리 선택으로 돌아갑니다.");
            }
            else if (choiceItem <= menuList.get(choiceCategory - 1).getMenuSize()) {
                // 선택한 메뉴 출력
                menuList.get(choiceCategory-1).printSelectedMenu(choiceItem);

                // 장바구니 추가 여부 확인
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인        2. 취소");
                int choiceAdd = scanner.nextInt();

                if (choiceAdd == 1){
                    // 장바구니에 추가
                    MenuItem item = menuList.get(choiceCategory-1).getMenu().get(choiceItem - 1);

                    // 이미 장바구니에 있다면 수량을 늘림
                    boolean isExist = false;
                    for (Cart c : cartList) {
                        if (c.getMenuItem().equals(item)) {
                            c.quantity += 1;
                            isExist = true;
                        }
                    }

                    // 장바구니에 없다면 새롭게 추가
                    if (isExist == false) {
                        cartList.add(new Cart(item, 1));
                    }

                    // 현재까지 총 주문 금액 합산
                    totalPrice += item.getPrice();

                    // 추가된 메뉴 확인 및 현재 장바구니 출력
                    System.out.println(item.getName() + "가 추가되었습니다.");

                    System.out.println("[ Orders ]");
                    for (Cart c : cartList) {
                        System.out.println(c);
                    }
                } else {
                    System.out.println("취소 되었습니다.");
                }
            }
            else {
                System.out.println("존재하지 않는 상품입니다.");
            }
        }
    }
}
