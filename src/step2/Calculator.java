package step2;

import java.util.ArrayList;

public class Calculator {

//    String[][] historys = new String[20][4];
//    // 2차원 배열 Arraylist로 변경
    ArrayList<String[]> data = new ArrayList<>();

    int index = 0;
    //계산기록을 저장할 2차원 행렬과 행번호를 매기기 위한 index


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

//        historys[index][0] = String.valueOf(num1);
//        historys[index][1] = sign;
//        historys[index][2] = String.valueOf(num2);
//        historys[index][3] = String.valueOf(result);
//        // TODO : 문자형 배열에 정수값이 안들어가서 정수를 문자형으로 변환후 대입
//        // 2차원 배열 Arraylist로 변경

        data.add(new String[4]);
        data.get(index)[0] = String.valueOf(num1);
        data.get(index)[1] = sign;
        data.get(index)[2] = String.valueOf(num2);
        data.get(index)[3] = String.valueOf(result);

        index++;

        return result;
        // 계산 결과 return

    }


//    String[][] getHistory() {
//        return this.historys;
//    }
//    // 계산기록 return getter 적용
//    // 2차원 배열 Arraylist로 변경

    ArrayList<String[]> getData() {
        return this.data;
    }

}

