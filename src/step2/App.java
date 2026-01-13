package step2;


import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        // 객체 생성

        int i = 0;

        while (true) {
            System.out.print("계산할 부호를 입력하세요( +, -, *, /, % ): ");
            String sign = sc.nextLine();

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            int result = calculator.sum(num1, num2, sign);

            if(sign.equals("+") || sign.equals("-") ){
                System.out.println("결과: " + result);
            }
            else if(sign.equals("*") || sign.equals("/")){
                System.out.println("결과: " + result);
            }
            else if (sign.equals("%")) {
                System.out.println("결과: " + result);
            }
            else{
                System.out.println("부호가 잘못 입력 되었습니다.");
            }
            // switch는 사용했으니 else if 사용해보기


            String emptybox = sc.nextLine();
            // enter 제거용

            System.out.print("더 계산하시겠습니까?(exit입력시 종료) ");
            String word = sc.nextLine();
            if (word.equals("exit")) {
                System.out.println("계산을 종료합니다...");
                break;
            }

            i++;

        }

        System.out.print("계산 목록을 보시겠습니까?(list 입력시 출력): ");
        String list = sc.nextLine();

        // 계산기록 행렬 불러오기
//        String[][] history = calculator.getHistory();
//        if (list.equals("list")) {
//            for (int count = 0; count<=i; count++) {
//                System.out.println(
//                        history[count][0] + " "
//                        + history[count][1] + " "
//                        + history[count][2] + " = "
//                        + history[count][3]
//                );
//            }
//        }
//    // 2차원 배열 Arraylist로 변경


        ArrayList<String[]> data = calculator.getData();
        if (list.equals("list")) {
            for (int count = 0; count<=i; count++) {
                System.out.println(
                        data.get(count)[0] + " "
                        + data.get(count)[1] + " "
                        + data.get(count)[2] + " = "
                        + data.get(count)[3]
                );
            }
        }

    }

}
