package com.itheima1.demo;

import javax.swing.*;
import java.awt.*;

public class myJFrame extends JFrame {
    public static void main(String[] args) {
        //   JButton jb=new JButton("点击一下");
    }

    public myJFrame() {
    /*    this.setSize(500,400);
        this.setVisible(true);*/
//        JFrame jf=new JFrame();
        init();
        /*this.setSize(600,400);
        this.setTitle("随机点名");
        JButton jt=new JButton("点击");
        this.setBounds(140,150,380,450);
        this.add(jt);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);*/
    }

    private void init() {
        this.setSize(600, 400);//窗口的大小
        this.setTitle("随机点名");//窗口的标题
        JButton jt = new JButton("点击");
        JButton jb0 = new JButton("小雨1");
        JButton jb1 = new JButton("小雨2");
        JButton jb2 = new JButton("小雨3");
        JButton jb4 = new JButton("小雨4");
        JButton jb5 = new JButton("小雨5");
        JButton jb6 = new JButton("小雨6");
        jframe jb = new jframe();
//        this.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));//流式布局 ,.LEFT 设置从左往右排列并设置侧边距和垂直边距
        this.setLayout(new BorderLayout(0, 0)); //边框布局按照东西南北中的方式布局
        // --边框布局默认添加到中间 2.边框布局和流式布局一样不能设置按钮的大小和位置
        //边框布局管理器中最多只能添加五个组件
//this.setLayout(null);空布局  可以自己设置大小，但是不能设置按钮位置，设置按钮位置之后就要 设置setresizable
        /*    this.setBounds(); //设置按钮的位置和大小*/
//        jt.setBounds(140,150,380,450);
        this.add(jt, BorderLayout.SOUTH); //将按钮添加到南边
        this.add(jb0, BorderLayout.WEST);//将按钮添加到西边
        this.add(jb1, BorderLayout.EAST);//将按钮添加到东边
        this.add(jb2, BorderLayout.NORTH);//将按钮添加到北边 // 边框布局
        this.add(jb4);
        this.add(jb5);
        this.add(jb6);
        this.setResizable(false); //固定大小不变动
        this.setLocationRelativeTo(null);//设置窗口位置在屏幕中心
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//点击x关闭窗口
        this.setVisible(true);//设置是否显示窗口
    }
}
