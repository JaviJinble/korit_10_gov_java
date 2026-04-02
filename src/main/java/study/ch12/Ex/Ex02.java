package study.ch12.Ex;
class Vehicle {
    String brand;  // 브랜드명

    // 최상위 부모 생성자
    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " 시동 켜기");
    }
}

class Car extends Vehicle {
    int doors;  // 문 개수

    // Vehicle을 상속받으므로 super(brand) 호출
    Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    void drive() {
        System.out.println(brand + " 주행 중");
    }
}

class ElectricCar extends Car {
    int battery;  // 배터리 잔량

    // Car를 상속받으므로 super(brand, doors) 호출
    ElectricCar(String brand, int doors, int battery) {
        super(brand, doors);
        this.battery = battery;
    }

    void charge() {
        System.out.println(brand + " 충전 중 (" + battery + "%)");
    }
}

public class Ex02 {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar("테슬라", 4, 80);

        ec.start();   // Vehicle의 메서드
        ec.drive();   // Car의 메서드
        ec.charge();  // ElectricCar의 메서드
    }
}
