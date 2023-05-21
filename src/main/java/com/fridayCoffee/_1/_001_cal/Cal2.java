package com.fridayCoffee._1._001_cal;

import javax.swing.*;
import java.awt.*;

// gui
public class Cal2 extends JFrame {

    private JTextField inputSpace;

    public Cal2(){ // 화면구성

        setLayout(null); //메서드 호출

        inputSpace = new JTextField();

        inputSpace.setEditable(false);
        inputSpace.setBackground(Color.WHITE);
        inputSpace.setHorizontalAlignment(JTextField.RIGHT); //정렬
        inputSpace.setBounds(8, 10, 230, 70); //위치

        JPanel buttonPanel = new JPanel(); //버튼
        buttonPanel.setLayout(new GridLayout(4, 4, 8, 8)); //칸,간격
        buttonPanel.setBounds(10, 90, 230, 200);


        String buttonNames[] = { "C", "÷", "×", "=", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "0" };
        JButton buttons[] = new JButton[buttonNames.length];

        for (int i = 0; i < buttonNames.length; i++) {
            buttons[i] = new JButton(buttonNames[i]);

            buttonPanel.add(buttons[i]); //버튼들 버튼패널에 추가하기
        }

        add(inputSpace);
        add(buttonPanel);

        setTitle("계산기");
        setVisible(true);
        setSize(270,350);
        setLocationRelativeTo(null); //화면가운데
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창닫을떄 같이 종료

    }


    //계산 기능 넣기
    public int Cal(String inputText) {
        return 0;
    }



    public static void main(String[] args) {
        new Cal2();
    }
}