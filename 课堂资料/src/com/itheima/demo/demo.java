package com.itheima.demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Random;

public class demo extends JFrame {
    AbstractList<JButton> AL = new ArrayList<>();
    private JPanel center;
    Random r=new Random();

    public demo() {
        init();
    }

    private void init() {
        this.setSize(500, 400);
        this.setTitle("随机点名");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //中间
        center = new JPanel();
        center.setLayout(new FlowLayout(FlowLayout.LEFT));
        for (int i = 0; i < 30; i++) {
            JButton jb = new JButton("李四");
            jb.setBackground(Color.pink);
            AL.add(jb);
            center.add(jb);
        }
        this.add(center);
        this.add(center,BorderLayout.CENTER);
        //底部
        JPanel foot = new JPanel();
        JButton FOOT = new JButton("点击");
        FOOT.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (FOOT.getText().equals("点击")) {
                    FOOT.setText("停止");
                    Component[] names = center.getComponents();
                    int index = r.nextInt(names.length);
                    names[index].setBackground(Color.blue);
                } else {
                    FOOT.setText("点击");
                }
            }
        });
        foot.add(FOOT);
        this.add(foot, BorderLayout.SOUTH);
        this.setVisible(true);

    }
}