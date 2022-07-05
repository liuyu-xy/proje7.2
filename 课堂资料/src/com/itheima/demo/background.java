package com.itheima.demo;

import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class background {
    public void BackgroundImage(JFrame frame, Container container, String ImageName) {
        // 限定加载图片路径，相对路径
        ImageIcon icon= new ImageIcon("res/" + ImageName);
        final JLabel labelBackground = new JLabel();
        ImageIcon im = icon;
        labelBackground.setIcon(im);
        // 设置label的大小
        labelBackground.setBounds(0,0,im.getIconWidth(),im.getIconHeight());
        // 将背景图片标签放入面板的最底层
        frame.getLayeredPane().add(labelBackground,new Integer(Integer.MIN_VALUE));
        // 将容器转换为面板设置为透明
        JPanel panel = (JPanel)container;
        panel.setOpaque(false);

    }


}