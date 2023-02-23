package com.fridayCoffee._002_student.transfer;

public class Bus extends Transfer {

    int charge = 1000;

    public Bus(int num) {
        this.transferNum = transferNum;
    }

    @Override
    public void take(int passenger) {
        this.passenger++;
        this.incomeTotal += charge;
    }

    public int getCharge() {
        return charge;
    }
}
