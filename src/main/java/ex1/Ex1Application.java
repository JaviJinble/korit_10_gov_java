package ex1;

import ex1.util.InputUtil;
import ex1.view.MainView;

import java.io.*;
import java.util.*;



public class Ex1Application {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);// 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(new StringReader("100")); // Scanner 성능 비교 테스트
        sc.nextInt();
        long t1 = System.nanoTime();
        InputUtil.nextInt();
        long t2 = System.nanoTime();
        System.out.println(t2 - t1);

        InputUtil.nextInt();


//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("[ 학생관리 프로그램 실행 ]");
        boolean flag = true; // 프로그램 실행 상태
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/"));
//        System.out.print("data 입력: ");
//        String data = bufferedReader.readLine();
//        System.out.println("data: " + data);

                while(flag) {
                    MainView.getInstance().run();
                    // 싱글톤 패턴을 사용하여 MainView 객체를 하나만 생성하고 재사용
                    System.out.print("입력 :"); // 줄바꿈 없이 입력을 같은 줄에서 받기 위해 print 사용

//                    List<Integer> ints = InputUtil.nextInts();
//                    int cmd = ints.get(0);
                    //======================================//
                    int cmd = InputUtil.nextInt();

//                    String cmd = bufferedReader.readLine(); // 사용자 입력을 문자열로 받아 명령어를 비교하기 위해 String 사용
//
//                    switch (cmd) {
//                        case "1":
//                            break;
//                        case "2":
//                            break;
//                        case "3":
//                            break;
//                        case "4":
//                            break;
//                        case "5":
//                            break;
//                        case "6":
//                            flag = false; // while문 종료
//                            break;
//                        default:
//                            System.out.println("다시 입력하세요."); // 올바르지 않은 입력일 경우 다시 입력하도록 안내
//                    }

//                    int cmd = 0;
//                    try {
//                        String input = bufferedReader.readLine();
//                        input.split(", ");
//                        input.split(",");
//                        input.split(" ");
// input2 = input.trim();
//
//

//                        StringBuilder stringBuilder = new StringBuilder();
//                        for (int i = 0; i < input2.length(); i++) {
//                            if (input2.charAt(i) > 47 && input2.charAt(i) < 58) {
//                                stringBuilder.append(input2.charAt(i));
//                            } else {
//                                stringBuilder.append(",");
//                            }
//                        }
//                        String[] splitStr = stringBuilder.toString().split(",");
//                        List<Integer> strList = Arrays.stream(splitStr).filter(str -> !str.isEmpty()).map(Integer::parseInt).toList(); // map(Integer::parseInt)
//                        System.out.println(strList);

//                        cmd = Integer.parseInt(bufferedReader.readLine());
//                    } catch (NumberFormatException e) {
//                        System.out.println("숫자만 입력가능합니다. 다시 입력하세요.");
//                        continue;
//                    }

                    if (cmd == 1) {

                    } else if (cmd == 2) {

                    } else if (cmd == 3) {

                    } else if (cmd == 4) {

                    } else if (cmd == 5) {

                    } else if (cmd == 6) {
                        break;
                    } else {
                        System.out.println("다시 입력하세요."); // 올바르지 않은 입력일 경우 다시 입력하도록 안내
                    }
                    // "6" 입력 시 break로 while문을 종료하여 프로그램을 끝냄
                    // 마지막 else if에서 break; 를 해주지 않으면 무한 루프로 인해 프로그램은 실행에 문제가 생긴다.
                }

        System.out.println("[ 학생관리 프로그램 종료 ]"); // 프로그램 종료 출력
        // "도달할 수 없는 코드 (unreachable code)"
//        scanner.close();
    }
}
