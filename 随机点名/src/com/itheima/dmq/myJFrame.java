package com.itheima.dmq;
import com.itheima.demo.jframe;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Random;
public class myJFrame extends JFrame {
    private JPanel center;
    AbstractList<JButton> AL = new ArrayList<>();

    public myJFrame() {
        init();
    }

    private void init() {
        this.setSize(600, 400);//窗口的大小
        this.setTitle("随机点名");//窗口的标题
        this.setResizable(false); //固定大小不变动
        this.setLocationRelativeTo(null);//设置窗口位置在屏幕中心
        this.setLayout(new BorderLayout());
        center = new JPanel();
        this.add(center, BorderLayout.CENTER);
        center.setLayout(new FlowLayout(FlowLayout.LEFT));

        for (int i = 0; i < 54; i++) {
            JButton jb = new JButton("张三");
            jb.setBackground(Color.lightGray);
            AL.add(jb);
            center.add(jb);
        }

/*
            Random rd=new Random();
           int index= rd.nextInt(30);
            System.out.println(al.get(index));*/ //抽取张三随机数
/*            jb1.setBackground(Color.green);//设置背景颜色
            jb1.setBackground(new Color(151, 230, 215));//rgb设置背景颜色
            jb1.setFont(new Font("黑体",Font.BOLD,16));//设置字体的字体，字体样式，字号
            jb1.setForeground(Color.red);//设置字体颜色*///设置背景颜色
/*            jb1.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                  //点击鼠标
                }

                @Override
                public void mousePressed(MouseEvent e) {
                   // jb1.setBackground(Color.yellow);//点击鼠标释放后
                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override*///监听器1
         /* jb1.addMouseListener(new MouseAdapter() {
              @Override
              public void mouseEntered(MouseEvent e) {
                  super.mouseEntered(e);
                  jb1.setBackground(Color.yellow);
              }
          });*///监听器2
/*            jb1.addMouseListener(new MouseAdapter() {
            });
            JButton jb2=new JButton("张三");
            JButton jb3=new JButton("张三");
            JButton jb4=new JButton("张三");
            JButton jb5=new JButton("张三");
            JButton jb6=new JButton("张三");
            JButton jb7=new JButton("张三");
            JButton jb8=new JButton("张三");
            JButton jb9=new JButton("张三");
            JButton jb10=new JButton("张三");
            JButton jb11=new JButton("张三");
            JButton jb12=new JButton("张三");
            JButton jb13=new JButton("张三");
            JButton jb14=new JButton("张三");
            JButton jb15=new JButton("张三");
            center.add(jb1);
            center.add(jb2);
            center.add(jb3);
            center.add(jb4);
            center.add(jb5);
            center.add(jb6);
            center.add(jb7);
            center.add(jb8);
            center.add(jb9);
            center.add(jb10);
            center.add(jb11);
            center.add(jb12);
            center.add(jb13);
            center.add(jb14);
            center.add(jb15);*/
        center ct = new center();
        // 下南 流
        JPanel left = new JPanel();
        left.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton jbsout = new JButton("点名");
        left.add(jbsout);
        this.add(left, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//点击x关闭窗口
        this.setVisible(true);//设置是否显示窗口
        Random RD = new Random();
        jbsout.addMouseListener(
                new MouseAdapter() {
                    private Component comp = null;
                    private Thread d;
                    Random random = new Random();

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (jbsout.getText().equals("点名")) {
                            jbsout.setText("停止");
                            Component[] names = center.getComponents();
                            for (int i = 0; i < names.length; i++) {
                                names[i].setBackground(Color.lightGray);
                            }

                            d = new Thread(() -> {
                                while (true) {
                                    int index = random.nextInt(names.length);
                                    names[index].setBackground(Color.blue);
                                    try {
                                        d.sleep(100);
                                    } catch (InterruptedException interruptedException) {
                                        interruptedException.printStackTrace();
                                    }
                                    names[index].setBackground(Color.lightGray);
                                }
                            });
                            d.start();
                        } else {
                            jbsout.setText("点名");
                            d.stop();
                        }

                    /*if (comp!=null) {
                        comp.setForeground(Color.black);
                        comp.setBackground(Color.lightGray);
                    }

                    //  jbsout.setBackground(Color.yellow);
                    Component[] com = center.getComponents();
                    int  index = RD.nextInt(com.length);
                    comp =com[index];
                    comp.setForeground(Color.red);
                    comp.setBackground(Color.yellow);*/
                    }
                }
        );
    }
                    }


