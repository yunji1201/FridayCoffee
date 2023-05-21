package com.fridayCoffee._1._001_cal;

import java.util.Scanner;

public class Cal3 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int num1, num2;
        String sign;

        System.out.print("첫번째 숫자를 입력하세요 = ");
        num1 = scan.nextInt();

        System.out.print("연산자를 입력하세요 = ");
        sign = scan.next();

        if (!(sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/"))) {
            System.out.println("올바르지 않은 기호입니다.");
        }

        System.out.print("두번째 숫자를 입력하세요 = ");
        num2 = scan.nextInt();

        Calculator(num1, num2, sign);
    }

    public static int Calculator(int num1, int num2, String sign) throws Exception {
        int result;

        if (sign.equals("+")) {
            result = num1 + num2;
        } else if (sign.equals("-")) {
            result = num1 - num2;
        } else if (sign.equals("*")) {
            result = num1 * num2;
        } else if (sign.equals("/")) {
            result = num1 / num2;
        } else if (sign.equals("%")) {
            result = num1 % num2;
        } else {
            throw new Exception();
        }

        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        return result;
    }

}
