package com.itheima.demo;
import javax.swing.*;
import javax.swing.text.Keymap;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
public class myjfname extends JFrame {
    Scanner sc=new Scanner(System.in);
    public  myjfname(){
        init();
        bodylx1();
        body();
        this.setVisible(true);//设置显示窗口
    }
    private void init(){
        this.setSize(500,400);
        this.setTitle("猜数字");
        this.setLayout(null);//设置空布局
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);//设置不可调节大小
    }
    private void bodylx1(){
        JLabel JL=new JLabel();
        JL.setSize(150,160);
        JL.setLocation(300,190);
        JTextField tf=new JTextField(); //文本输入框的构造方法
        tf.setLocation(150,100);
        tf.setSize(150,40);
        JButton jb=new JButton("搜索");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String st=tf.getText();
                    System.out.println(st);
                    JL.setText(st);
            }
        });
        jb.setSize(60,30);
        jb.setLocation(300,105);
/*        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) { // 文本域增加键盘监听器，回车按下
                super.keyPressed(e);
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                                String st=tf.getText();
                                System.out.println(st);
                                JL.setText(st);
                }
            }
        });*///调用tf.addkeyactionlinsener
        tf.addActionListener( //使用最常用的动作
                (ActionEvent e)-> {
              /*      String st=tf.getText();
                    System.out.println(st);
                    JL.setText(st);*/
                    jb.doClick();
        });
        this.add(JL);
        this.add(jb);
        this.add(tf);
    }
    private void body(){
        JLabel jl=new JLabel("欢迎来到猜数字游戏");
        jl.setBackground(Color.white);  //设置容器的背景颜色
        jl.setOpaque(true);//设置容器背景颜色的透明度 可写值有 true 和FALSE
        //当设置背景颜色时如果没有设置透明度或透明度为FALSE，那么背景颜色不生效
        jl.setSize(200,50);
        jl.setLocation(0,0);
        jl.setFont(new Font("黑体",Font.BOLD,16));
        jl.setForeground(Color.red); //
        jl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jl.setToolTipText("这是猜数字游戏");
        this.add(jl);
        JLabel jl1=new JLabel();
      //  JLabel jl1=new JLabel(new ImageIcon("猜数字/src/image1.png"));
        jl1.setIcon(new ImageIcon("猜数字/src/image1.png"));//使用调用方法在容器内传入图片
        jl1.setLocation(0,0);//设置jlable容器的位置
        jl1.setSize(600,400);//设置大小
        jl1.setCursor(new Cursor(Cursor.HAND_CURSOR));//鼠标放置在图片上时变为小手
        jl1.setToolTipText("这是一个背景图片");//设置图片的说明文字
        this.add(jl1);
    }

}
