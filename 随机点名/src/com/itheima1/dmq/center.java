package com.itheima1.dmq;

import javax.swing.*;
import java.awt.*;

public class center extends JFrame {
    public center() {
        init();
    }

    public void init() {
        this.setLayout(new BorderLayout());
        JPanel center1 = new JPanel();
        this.add(center1, BorderLayout.CENTER);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton jb1 = new JButton("张三");
        JButton jb2 = new JButton("张三");
        JButton jb3 = new JButton("张三");
        JButton jb4 = new JButton("张三");
        JButton jb5 = new JButton("张三");
        JButton jb6 = new JButton("张三");
        JButton jb7 = new JButton("张三");
        JButton jb8 = new JButton("张三");
        JButton jb9 = new JButton("张三");
        JButton jb10 = new JButton("张三");
        JButton jb11 = new JButton("张三");
        JButton jb12 = new JButton("张三");
        JButton jb13 = new JButton("张三");
        JButton jb14 = new JButton("张三");
        JButton jb15 = new JButton("张三");

        center1.add(jb1);
        center1.add(jb2);
        center1.add(jb3);
        center1.add(jb4);
        center1.add(jb6);
        center1.add(jb7);
        center1.add(jb8);
        center1.add(jb9);
        center1.add(jb10);
        center1.add(jb11);
        center1.add(jb12);
        center1.add(jb13);
        center1.add(jb14);
        center1.add(jb15);
    }

}

