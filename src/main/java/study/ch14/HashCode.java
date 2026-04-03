package study.ch14;

import java.util.Objects;

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class HashCode {
    public static void main(String[] args) {
        Dog dog = new Dog("포치", 10);
        Dog dog2 = new Dog("포치", 10);
        System.out.println(dog.hashCode());
        System.out.println(dog2.hashCode());
        Dog[] dogs =  {
                new Dog("포치일", 11),
                new Dog("포치이", 10),
                new Dog("포치", 12),
                new Dog("포치", 11),
        };
        Dog foundDog = null;
        int hashCode = Objects.hash("포치", 11);
        for (Dog d : dogs) {
            if (d.hashCode() == hashCode) {
                foundDog = d;
                break;
            }
        }
        System.out.println(foundDog);
    }
}
