package com.fridayCoffee._1._001_cal;

import java.util.Scanner;

// 기본적인 사칙연산
public class Cal1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int num1, num2;
        String sign;
        int result;


        while (true) {
            System.out.print("숫자입력 = ");
            num1 = sc.nextInt();

            while (true) {
                System.out.print("연산자 입력 = ");
                sign = sc.next();

                if (sign.equals("+") || sign.equals("-") ||
                        sign.equals("*") || sign.equals("/")) {
                    break;
                }
                System.out.println("올바르지 않은 연산자 기호");
            }

            while (true) {
                System.out.print("숫자입력 = ");
                num2 = sc.nextInt();
                if (num2 == 0) {
                    System.out.println("0은 입력할 수 없습니다");
                } else {
                    break;
                }
            }

//            int result = Cal3.getResult(num1, num2, sign);
        }
    }
}