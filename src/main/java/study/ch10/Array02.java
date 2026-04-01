package study.ch10;


public class Array02 {
    public static void main(String[] args) {
        int[] iArr = { 1, 2, 3, 4, 5 };
        char[] cArr = { 'a', 'b', 'c', 'd', 'e'};
        boolean[] bArr = { true, false, true, false};
        double[] dArr = { 1.0, 3.14, 5.5};
        String[] sArr = { "김명준", "김명규", "김민성"};


        class Student {
            private String name;

            // 기본 생성자 추가
            Student() {

            }

            Student(String name) {
                this.name = name;
            }

            public void setName (String name) {
                this.name = name;
            }
        }


        Student [] students = {
                new Student("김명준"),
                new Student("김명규"),
                new Student("김민성")
        };

        Student[] students2 = { new Student(), new Student(), new Student() };
        students2[0].setName("김명준");
        students2[1].setName("김명규");
        students2[2].setName("김민성");
    }
}
