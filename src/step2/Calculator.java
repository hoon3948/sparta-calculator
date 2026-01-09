package step2;

public class Calculator {

    boolean[][] board = new boolean[20][4];

    int sum (int num1, int num2, String sign) {
        int result = 0;

        switch (sign) {
            case "+":
                result = num1 + num2;
                System.out.println("결과: " + result);
                break;
            case "-":
                 result = num1 - num2;
                 System.out.println("결과: " + result);
                 break;
            case "*":
                result = num1 * num2;
                System.out.println("결과: " + result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println("결과: " + result);
                break;
            case "%":
                result = num1 % num2;
                System.out.println("결과: " + result);
                break;
            default:
                System.out.println("부호가 잘못 입력 되었습니다.");
        }
        return result;
    }








}