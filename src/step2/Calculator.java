package step2;

public class Calculator {

    String[][] history = new String[20][4];
    int index = 0;
    //계산기록을 저장할 리스트와 행번호를 메길 index

    int sum (int num1, int num2, String sign) {
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
            default:
                break;
        }
        // switch에서 한번에 결과값까지 출력하는것이 더 깔끔해보임

        history[index][0] = String.valueOf(num1);
        history[index][1] = sign;
        history[index][2] = String.valueOf(num2);
        history[index][3] = String.valueOf(result);
        // TODO : 문자형 배열에 정수값이 안들어가서 정수를 문자형으로 변환후 대입

        index++;

        return result;
    }


    public String[][] getHistory() {
        return history;
    }
    // 계산기록 return
}