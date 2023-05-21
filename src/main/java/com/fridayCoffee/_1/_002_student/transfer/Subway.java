package com.fridayCoffee._1._002_student.transfer;

public class Subway extends Transfer{

    int charge = 5000;

    public Subway(int transferNum) {
        this.transferNum = transferNum;
    }

    public int getCharge() {
        return charge;
    }

    @Override
    public void take(int passenger) {
        this.passenger++;
        this.incomeTotal += charge;
    }
}
