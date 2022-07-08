package com.itheima.demo;
import javax.swing.*;
import java.awt.*;
public class demo1 extends JFrame {
    public demo1(){
        init();
        this.setVisible(true);
    }
    private void init(){
        this.setSize(500,400);
        this.setTitle("练习1");
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        JTabbedPane jp=new JTabbedPane();
        JPanel JP=new JPanel();
        JButton jb=new JButton("登录");
        JP.add(jb);
        jp.addTab("登录",JP);
        this.add(jp);
        JPanel Jp=new JPanel();
        JButton JB=new JButton("注册");
        Jp.add(JB);
        jp.addTab("注册",Jp);

    }
}
