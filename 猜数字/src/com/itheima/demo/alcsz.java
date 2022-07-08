package com.itheima.demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
public class alcsz extends JFrame {
    ArrayList<Object> al=new ArrayList<>();
    JTextField text=new JTextField();
    Random r=new Random();
    int i= r.nextInt(100)+1;
    int min=0;
    int max=100;
    JLabel hint=new JLabel();
    JButton putin =new JButton("确认");
    JButton restart=new JButton("重置");
    public alcsz(){
        init();
        welcometext();
        hint();
        inittext();
        sout();
        putin();
        restart();
        blackground();
        this.setVisible(true);
    }
    private void init(){
        this.setSize(500,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    private void welcometext(){
        JLabel welcomet=new JLabel("欢迎来到猜数字小游戏！！");
        welcomet.setSize(300,40);
        welcomet.setFont(new Font("黑体",Font.BOLD,20));
        welcomet.setLocation(140,10);
        this.add(welcomet);
    }
    private void hint(){
        hint.setSize(500,120);
        hint.setText("猜数字游戏开始喽~");
        hint.setFont(new Font("楷体",Font.BOLD,20));
        hint.setLocation(130,60);
        this.add(hint);
    }
    private void inittext() {
        text.setSize(330, 50);
        text.setLocation(160, 200);
        System.out.println("生成的随机数为:"+i);
        text.addActionListener(e -> putin.doClick());//回车提交
        putin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t = text.getText();
                if (t.equals("")) {
                    hint.setText("输入为空请您重新输入");
                    return;
                }
                for (int i1 = 0; i1 < t.length(); i1++) {
                    char c = t.charAt(i1);
                    if (c < '0' || c > '9') {
                        hint.setText("输入非法字符！！");
                        return;
                    }
                }
                int anInt = Integer.parseInt(t);
                if (anInt > 0 & anInt < 100) {
                    if (anInt < i) {
                        min = anInt;
                        al.add(min);
                        hint.setText("猜的太小啦！应该在" + min + "和" + max + "之间");
                        text.setText("");
                    } else if (anInt > i) {
                        max = anInt;
                        al.add(max);
                        hint.setText("猜的太大啦！应该在" + min + "和" + max + "之间");
                        text.setText("");
                    } else if (anInt == i) {
                        hint.setText("恭喜你猜对啦！");
                    } else {
                        text.setText("");
                        hint.setText("输入非法，请重新输入");
                    }
                }
            }
        });
        this.add(this.text);
    }
    private void sout(){
        JLabel sout=new JLabel("请输入您猜的数字");
        sout.setFont(new Font("楷体",Font.BOLD,19));
        sout.setSize(200,40);
        sout.setLocation(0,205);
        this.add(sout);
    }
    private void putin(){
        putin.setSize(60,50);
        putin.setLocation(260,260);
        putin.addActionListener(e -> {
            String st=text.getText();
            System.out.println("您输入的数字为:"+st);

        });
        this.add(putin);
    }
    private void restart(){
        restart.setSize(60,50);
        restart.setLocation(360,260);
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                hint.setText("猜数字游戏开始喽~");
                i= r.nextInt(100)+1;
                System.out.println("生成的随机数为:"+i);
                min=1;
                max=100;


            }
        });
        this.add(restart);
    }
    private void blackground(){
        JLabel blackground=new JLabel();
        blackground.setToolTipText("这是背景图片");
        blackground.setIcon(new ImageIcon(getClass().getResource("/image1.png")));
        blackground.setIcon(new ImageIcon("猜数字\\src\\image1.png"));
        blackground.setLocation(0,0);
        blackground.setSize(400,400);
        blackground.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(blackground);
    }
}
