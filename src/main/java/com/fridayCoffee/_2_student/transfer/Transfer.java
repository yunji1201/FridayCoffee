package com.fridayCoffee._2_student.transfer;


import static com.fridayCoffee._2_student.Go.scan;

public abstract class Transfer {
    int transferNum;
    int passenger;
    int incomeTotal;

    public abstract void take(int passenger);
    public abstract int getCharge();

//    System.out.print("비행기 항공편이 어떤 것 인가요? : ");
    int num = scan.nextInt();
    Airplane airplane = new Airplane(num);

//    void calculDistance() {
//
//    }
//

    void calculDistance() {

    }


//    info(stu3, transfer, num) {
//
//    }
}
