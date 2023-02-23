package com.fridayCoffee._2_student.transfer;

public class Airplane extends Transfer {

    int charge = 50000;

    public Airplane(int num) {
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
