package study.ch20.Ex;

//### 문제 8. Employee 리스트 — 부서별 필터
//`Employee` 클래스(name, dept, salary)를 만들고 특정 부서의 직원만 필터링하시오.
//데이터:
// 김(개발팀, 4000), 이(마케팅, 3500), 박(개발팀, 4500),
// 최(인사팀, 3000), 정(개발팀, 3800)
// "개발팀" 필터 결과: [김(4000),박(4500),정(3800)]
// 개발팀 평균 연봉: 4100

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
class Employee {
    private String name, dept;
    private int salary;
    Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

}

public class Ex08 {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>(); // 직원 전체

        // 김(개발팀, 4000), 이(마케팅, 3500), 박(개발팀, 4500),
        // 최(인사팀, 3000), 정(개발팀, 3800)
        // "개발팀" 필터 결과: [김(4000),박(4500),정(3800)]
        // addAll
        emps.addAll(List.of(
                Employee.builder().name("김").dept("개발팀").salary(4000).build(),
                Employee.builder().name("이").dept("마케팅").salary(3500).build(),
                Employee.builder().name("박").dept("개발팀").salary(4500).build(),
                Employee.builder().name("최").dept("인사팀").salary(3000).build(),
                Employee.builder().name("정").dept("개발팀").salary(3800).build()
        )); // 직원 전체

        // 부서별
//        List<Employee> devTeam = new ArrayList();
//        List<Employee> markTeam = new ArrayList();
//        List<Employee> persTeam = new ArrayList();
//        for (Employee employee : emps) {
//            if ("".equals(employee.getDept())) devTeam.add(employee);
//            if ("".equals(employee.getDept())) markTeam.add(employee);
//            if ("".equals(employee.getDept())) persTeam.add(employee);
//        }


        // 부서별로 바로 담기
        Map<String, List<Employee>> deptMap = new HashMap<>();
        for (Employee emp : emps) {
            deptMap
                    .computeIfAbsent(emp.getDept(), k -> new ArrayList<>())
                    .add(emp);
        }
// deptMap.computeIfAbsent(emp.getDept(), k -> new ArrayList<>()).add(emp);
// 의미: 해당 부서 리스트 없으면 생성 있으면 그대로 사용 그리고 추가
// HashMap = 필터링 제거 도구
        // 개발팀 바로 꺼내기
        List<Employee> devTeam = deptMap.get("개발팀");
        System.out.println("개발팀 직원: " + devTeam);

        // 평균 계산
        int sum = 0;
        for (Employee emp : devTeam) {
            sum += emp.getSalary();
        }
        double avg = (double) sum / devTeam.size();
        System.out.println("개발팀 평균 연봉: " + avg);


    }
}
