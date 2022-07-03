package com.itheima.demo;
import javax.swing.*;
public class jframe {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setSize(600,400);
        jf.setTitle("随机点名");
        JButton jt=new JButton("点击");
        jt.setBounds(40,50,80,45);
        jf.add(jt);
        jf.setLocationRelativeTo(null);

        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
     //   jf.setLocation(450,200);


    }
}
