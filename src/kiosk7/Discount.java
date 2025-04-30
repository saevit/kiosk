package kiosk7;

public enum Discount {
    NATIONAL_MERIT("국가유공자", 0.1), // 10% 할인
    MILITARY("군인", 0.05),            // 5% 할인
    STUDENT("학생", 0.03),             // 3% 할인
    GENERAL("일반", 0);               // 0% 할인

    // 속성
    private final String label;
    private final double discountRate;

    // 생성자
    Discount(String label, double discountRate) {
        this.label = label;
        this.discountRate = discountRate;
    }

    // 기능
    public String getLabel() {
        return this.label;
    }

    public double getDiscountRate() {
        return this.discountRate;
    }
}
