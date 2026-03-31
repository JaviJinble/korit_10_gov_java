package study.ch09;

import study.ch09.entity.Teacher;
import study.ch09.entity.User;

public class Main {

    public static void main(String[] args) {
      Student s1 = new Student();
      //Teacher t1 = new Teacher();
      Teacher t1 = new Teacher("강준일", 33);

      s1.name = "김명준";
      s1.age = 29;

      //t1.name = "강준일";
      //t1.age = 33;
      //t1.월급 = t1.월급계산(200000);


      User user = new User("korit001");
      user.setPassword("1111");
      user.setName("김명준");

      System.out.println(user.getUsername());

//      s1.printInfo();
//      t1.printInfo();
    }

}
