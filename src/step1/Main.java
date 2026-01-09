package step1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("계산할 부호를 입력하세요( +, -, *, /, % ): ");
            String sign = sc.nextLine();
            // TODO : scanner가 문자 입력을 받지않고 무시하는 현상 발생.
            // 정수를 입력하고 넘어가기위해 입력한 엔터가 자동으로 입력되었다고 분석
            // 정수보다 먼저 입력하는 것으로 해결

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.



            int result = 0;
            switch (sign) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                case "%":
                    result = num1 % num2;
                    break;
            }

            System.out.println("결과: " + result);

            String emptybox = sc.nextLine();
            // enter 제거용

            System.out.print("더 계산하시겠습니까?(exit입력시 종료) ");
            String word = sc.nextLine();

            if (word.equals("exit")) {
                System.out.println("계산을 종료합니다...");
                break;
            }

        }

    }

}
