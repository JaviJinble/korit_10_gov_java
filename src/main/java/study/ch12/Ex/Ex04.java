package study.ch12.Ex;

class Employee {
    String name;   // 직원 이름
    int salary;    // 월급

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // 연봉 계산: 월급 * 12
    int getAnnualSalary() {
        return salary * 12;
    }
}

class Manager extends Employee {
    int bonus;  // 보너스

    Manager(String name, int salary, int bonus) {
        super(name, salary);  // 부모의 name, salary 초기화
        this.bonus = bonus;
    }

    // 부모 메서드를 재정의(오버라이딩)
    @Override
    int getAnnualSalary() {
        return salary * 12 + bonus;
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Employee e = new Employee("김사원", 300);
        Manager m = new Manager("박부장", 500, 1000);

        System.out.println(e.getAnnualSalary()); // 3600
        System.out.println(m.getAnnualSalary()); // 7000
    }
}
