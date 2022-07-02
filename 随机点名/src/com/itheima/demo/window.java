package com.itheima.demo;
import javax.swing.*;
public class window {
    public static void main(String[] args) {
        //导入窗口包
            JFrame jf=new JFrame();
        //设置窗口的宽高
        jf.setSize(500,400);
        //设置窗口的弹出位置，以像素为单位

//        jf.setLocation(450,210);
        //屏幕中间位置弹出
        jf.setLocationRelativeTo(null);
        //设置窗口标题
        jf.setTitle("随机点名器");
        //显示器
            jf.setBounds(100,30,400,200);
        //是否显示窗口
        jf.setVisible(true);
        //设置按钮
        JButton jb=new JButton("点击一下");
        jb.setBounds(185,293,95,38);
        jf.add(jb);

        //点击x关闭窗口
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }
}
