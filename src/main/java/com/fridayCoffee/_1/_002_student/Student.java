package com.fridayCoffee._1._002_student;


import com.fridayCoffee._1._002_student.transfer.Transfer;

public class Student {
    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void take(Transfer transfer) {
        this.money -= transfer.getCharge();
        transfer.take(1);
    }


    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public String info() {
        return this.getName() + "의 남은 돈은 " + this.getMoney() + "원 입니다";
    }
}
