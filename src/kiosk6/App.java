package kiosk6;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // 햄버거 메뉴 리스트 생성
        List<MenuItem> burgers = new ArrayList<>();
        burgers.add(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 사이드 메뉴 리스트 생성
        List<MenuItem> side = new ArrayList<>();
        side.add(new MenuItem("Fries", 4900, "바삭하고 담백한 크링클 컷 프라이"));
        side.add(new MenuItem("Cheese Fries", 6000, "고소하고 진한 치즈 소스를 듬뿍 올린 크링클 컷 프라이"));

        // 음료 메뉴 리스트 생성
        List<MenuItem> drinks = new ArrayList<>();
        drinks.add(new MenuItem("Soda", 2900, "코카콜라, 스프라이트, 환타 오렌지, 환타 그레이프, 환타 파인애플"));
        drinks.add(new MenuItem("Lemonade", 4500, "매장에서 직접 만드는 상큼한 레몬에이드"));
        drinks.add(new MenuItem("Hot Tea", 3400, "보성 유기농 찻잎을 우려낸 녹차, 홍차, 페퍼민트 & 레몬그라스"));

        // 카테고리 생성
        Menu burgerMenu = new Menu("BURGERS", burgers);
        Menu sideMenu = new Menu("SIDE", side);
        Menu drinksMenu = new Menu("DRINKS", drinks);

        // 전체 메뉴 리스트 생성
        List<Menu> menuList = new ArrayList<>();
        menuList.add(burgerMenu);
        menuList.add(sideMenu);
        menuList.add(drinksMenu);

        // 키오스크 생성 및 실행
        Kiosk kiosk = new Kiosk(menuList);
        kiosk.start();
    }
}
