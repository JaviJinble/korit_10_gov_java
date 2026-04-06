package study.ch16;

import lombok.Getter;

@Getter
class Config { // Config 싱글톤 중요 시험문제 출제.
    private static Config instance;
    private DBConnection dbConnection; // 인스턴스 변수

    private  Config() {}


    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }
    public void init() {
        System.out.println("설정 초기화");
        dbConnection = DBConnection.getInstance();
    }
}

class DBConnection {
    private static DBConnection instance; // 자기 자신과 동일한 자료형을 만든다. private static 이어야한다

    private DBConnection() {}

    public void connection() { // 인스턴스 매서드
        System.out.println("데이터 베이스 연결");
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance; //
    }
}

class A1 {

    private B1 b1;

    public A1(B1 b1) { // 의존성 주입
        this.b1 = b1;
    }

    public void run() {
        b1.print();
        Config.getInstance().getDbConnection().connection();
        DBConnection.getInstance().connection();
    }
}

class B1 {
    public void print() {
        System.out.println("B1 내용 출력");
        Config.getInstance().getDbConnection().connection();
        DBConnection.getInstance().connection();
    }
}

class A2 {
    private B2 b2;

    public A2(B2 b2) { // 의존성 주입
        this.b2 = b2;
    }

    public void integrationTest() {
        b2.test();
        Config.getInstance().getDbConnection().connection();
        DBConnection.getInstance().connection();
    }
}
class B2 {
    public void test() {
        System.out.println("B2 테스트 실행");
        Config.getInstance().getDbConnection().connection();
        DBConnection.getInstance().connection();
    }
}

public class Static03 {
    public static void main(String[] args) {
        Config.getInstance().init(); // 최초로 객체 생성

        B1 b1 = new B1();
        B2 b2 = new B2();
        A1 a1 = new A1(b1);
        A2 a2 = new A2(b2);

        a1.run();
        a2.integrationTest();

    }
}
