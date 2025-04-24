package kiosk4;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // 햄버거 메뉴 리스트 정의
        List<MenuItem> burgers = new ArrayList<>();

        burgers.add(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu menu = new Menu(burgers);

        Kiosk kiosk = new Kiosk(menu);
        kiosk.start();
    }
}
