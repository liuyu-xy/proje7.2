package com.itheima.demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Random;
public class Randemoname extends JFrame {
    AbstractList<JButton> AL = new ArrayList<>();
    private JPanel center;
    Random r=new Random();
    private Thread d;
    public  Randemoname() throws IOException {
        init();
        initcenter();
        initsouth();
        this.setVisible(true);
    }
    private void init(){
        this.setSize(500, 400);
        this.setTitle("随机点名");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private  void initcenter(){
        center = new JPanel();
        center.setLayout(new FlowLayout(FlowLayout.LEFT));
     /*   for (int i = 0; i < 30; i++) {
            JButton jb = new JButton("李四");
            jb.setBackground(Color.pink);
            AL.add(jb);
            center.add(jb);
        }*/
        this.add(center);
        this.add(center,BorderLayout.CENTER);
    }
    private  void initsouth() throws IOException {
        JPanel foot = new JPanel(); //创建底部的容器
        foot.setLayout(new FlowLayout(FlowLayout.CENTER));//设置底容器内的布局为流式布局居中
        JButton jbsout = new JButton("点名");//创建点名按钮
        foot.add(jbsout);//将按钮添加到底部容器内
        InputStreamReader reader = new InputStreamReader(Randemoname.class.getClassLoader().getResourceAsStream("names.txt"),"UTF-8");
        BufferedReader br=new BufferedReader(reader);
        String name;
        while ((name= br.readLine())!=null){
            JButton jb = new JButton(name);
            jb.setBackground(Color.lightGray);
            center.add(jb);
        }
        br.close();
        this.add(foot, BorderLayout.SOUTH); //将底部容器添加到窗口内，使用边框布局，且在南边
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
                            d = new Thread(() -> { //多线程
                                while (true) {//死循环
                                    int index = random.nextInt(names.length);
                                    names[index].setBackground(Color.blue);
                                    try {
                                        d.sleep(100); //让线性等待/睡眠一会 睡眠100毫秒
                                    } catch (InterruptedException interruptedException) {
                                        interruptedException.printStackTrace();
                                    }
                                    names[index].setBackground(Color.lightGray);
                                }
                            });
                            d.start();//多线程调用start
                        } else {
                            jbsout.setText("点名");
                            d.stop();//线程结束
                        }
                    }
                });}}



