package com.fridayCoffee._2_student;


import com.fridayCoffee._2_student.constans.Place;
import com.fridayCoffee._2_student.constans.Transportation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Go {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.print("이름을 입력해주세요 : ");
        String name = scan.nextLine();

        // TODO: 숫자가 아닐때 검증!
        System.out.print("가지고 있는 현금의 금액을 입력해주세요 : ");
        int money = scan.nextInt();

        Student stu3 = new Student(name, money);

        // TODO : 교통수단이 아닐때 검증
        // TODO : 돈이 부족할 때 검증
        System.out.print("사용하려는 교통수단을 입력해주세요 : ");
        String name1 = scan.nextLine();

        String transfer = scan.nextLine();

        // TODO : 중복되는 코드 메서드로 빼기 => 어떻게?
        if (transfer.equals(Transportation.BUS.toString()) || transfer.equals(Transportation.AIRPLANE.toString()) || transfer.equals(Transportation.SUBWAY.toString())) {

        } else {
            System.out.println("잘못된 교통수단입니다.");
        }

        System.out.println("============================================");

    }

    private static void info(Student stu3, String transfer, int num) {
        System.out.println("=> " + stu3.name + "은(는) " + num + "번 " + transfer + "을 타서 " + stu3.money + "이 남았습니다.");
    }

    public static void calculDistance() {
        System.out.print("현재 있는 곳의 좌표를 알려주세요 (ex:1,2) :");
        String position1 = scan.nextLine();
        String position = scan.nextLine();
        Double x1 = Double.parseDouble(position.split(",")[0]);
        Double y1 = Double.parseDouble(position.split(",")[1]);

        HashMap<Place, Double> map = new HashMap();

        for (Place i : Place.values()) {
            Double x2 = Double.parseDouble(i.getPoint().split(",")[0]);
            Double y2 = Double.parseDouble(i.getPoint().split(",")[1]);

            map.put(i, distance(x1, y1, x2, y2));
        }

        Double maxValue = Collections.max(map.values());
        Double minValue = Collections.min(map.values());

        String maxPlace = null;
        String minPlace = null;

        // TODO : 같은 거리값이 나온다면?
        for (Place key : map.keySet()) {
            if (map.get(key).equals(maxValue)) {
                maxPlace = key.toString();
            }
            if (map.get(key).equals(minValue)) {
                minPlace = key.toString();
            }
        }

        System.out.println("현재 위치에서 가장 먼 장소는 " + maxPlace + " 입니다");
        System.out.println("현재 위치에서 가장 가까운 장소는 " + minPlace + " 입니다");

    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double ac = Math.abs(y2 - y1);
        double cb = Math.abs(x2 - x1);

        return Math.hypot(ac, cb);
    }
}
