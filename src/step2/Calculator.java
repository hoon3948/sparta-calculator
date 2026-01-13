package step2;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<String[]> data = new ArrayList<>();

    private int index = 0;
    //계산기록을 저장할 2차원 행렬과 행번호를 매기기 위한 index

    private int result = 0;
    private int num1;
    private int num2;
    private char sign;

    public void setElement(int num1, int num2, char sign){
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;
        sum();
    }

    private void sum () {

        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                 result = num1 - num2;
                 break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                break;
        }
        // switch에서 한번에 결과값까지 출력하는것이 더 깔끔해보임

        data.add(new String[4]);
        data.get(index)[0] = String.valueOf(num1);
        data.get(index)[1] = String.valueOf(sign);
        data.get(index)[2] = String.valueOf(num2);
        data.get(index)[3] = String.valueOf(result);
        // TODO : 문자형 배열에 정수값이 안들어가서 정수를 문자형으로 변환후 대입

        index++;
    }
    public int getResult() {
        return this.result;
    }
    // 계산 결과 return

    public ArrayList<String[]> getData() {
        return this.data;
    }
    // 계산기록 return getter 적용

    public void removeResult() {
        data.remove(0);
    }

}

