package com.itheima.demo;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
public class demo1 {
    //创建显示器对象
    static JLabel label = new JLabel("欢迎使用点名器",JLabel.CENTER);
    public static void main(String[] args) {
        //点名器相关的页面
        // 显示窗口
        JFrame frame = new JFrame();

        //设置窗口大小
        frame.setSize(400,250);
        frame.setLayout(null);

        //先放显示器

        //给显示器设置位置
        label.setBounds(100,30,200,200);
        //将显示器放到窗口
        frame.add(label);

        //创建按钮的对象
        JButton button = new JButton("点名");
        //给按钮设置位置
        button.setBounds(150,150,100,40);
        frame.add(button);


        //给按钮添加监听器，采用匿名内部类方式写法
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //调用随机点名方法
                callName();
            }
        });


        //显示窗口
        frame.setVisible(true);
    }

    //定义名字数组
    static String [] names = {"王煜希","郑成功","刘旭","钟芳","曹吵"
            ,"车俊","刘蔓","呈菁","刘嘉佳","泽鑫","李礼"};
    static Random random = new Random();

    /**
     * 点击按钮，随机点名
     * 作用：
     * 1.随机获取名字，要显示到显示器上面
     * 2.要显示到显示器上
     */
    public static void callName(){
        //定义变量i，随机生成i的值
        //通过查询生成随机数
        int i = random.nextInt(10);
        //随机从数组中获取元素
        String name = names[i];
        //把名字放到显示器上
        label.setText(name);
    }
}
