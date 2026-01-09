package step2;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();


        while (true) {
            System.out.print("계산할 부호를 입력하세요( +, -, *, /, % ): ");
            String sign = sc.nextLine();

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            int result = calculator.sum(num1, num2, sign);

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
