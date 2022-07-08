package com.itheima.demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
public class login extends JFrame {
ArrayList<String> AL=new ArrayList<>();
JTabbedPane jtp=new JTabbedPane();
 static String yzm = creatCode(3);
    public  login(){
        init();
        creatCode(4);
        login1();
        register();
        this.setVisible(true);
    }
    private void init(){
        this.setSize(400,300);
        this.setTitle("登录注册界面");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }//页面初始化
    public static String creatCode(int n) {
        //定义一个字符串变量 记录生成的随机数
        Random r = new Random();
        String code = "";
        int type = r.nextInt(3);
        //2.在方法内部使用for循环生成指定位数的随机字符，并连接起来
        for (int i = 0; i <= n; i++) {
            //生成一个随机字符：大写 ，小写 ，数字（0  1  2）
            switch (type) {
                //大写字母  65   ~   65+25
                case 0:
                    char ch = (char) (r.nextInt(26) + 65);
                    code += ch;
                    break;
                //小写字母  90   ~   97+25
                case 1:
                    char ch1 = (char) (r.nextInt(26) + 97);
                    code += ch1;
                    break;
                //大写字母  65   ~   65+25
                case 2:
                    code +=  r.nextInt(10);
                    break;
            }
        }
        return code;

    }
    private void login1(){
        JPanel jp1=new JPanel(null);
        JLabel jl1=new JLabel("手机号");
  //      jl1.setBackground(Color.white);
        jl1.setOpaque(true);
        jl1.setFont(new Font("黑体",Font.BOLD,16));
        jl1.setSize(60,40);
        jl1.setLocation(44,21);

        JTextField jt=new JTextField();
        jt.setSize(233,28);
        jt.setLocation(120,28);
        jp1.add(jt);

        JLabel jl2=new JLabel("密  码");
     //   jl2.setBackground(Color.white);
        jl2.setOpaque(true);
        jl2.setFont(new Font("黑体",Font.BOLD,16));
        jl2.setSize(60,40);
        jl2.setLocation(44,62);

        JPasswordField jt2=new JPasswordField();
        jt2.setSize(233,28);
        jt2.setLocation(120,68);
        jp1.add(jt2);

        JLabel jl3=new JLabel("验证码");
       // jl3.setBackground(Color.white);
        jl3.setOpaque(true);
        jl3.setFont(new Font("黑体",Font.BOLD,16));
        jl3.setSize(60,40);
        jl3.setLocation(44,105);

        JTextField jt3=new JTextField();
        jt3.setSize(86,28);
        jt3.setLocation(120,108);
        jp1.add(jt3);

        JLabel jl4=new JLabel();
        jl4.setBackground(Color.white);
        jl4.setOpaque(true);
        jl4.setSize(75,30);
        jl4.setLocation(210,108);
        jl4.setText(yzm);
        jl4.setFont(new Font("宋体",Font.BOLD,20));
        jl4.setForeground(Color.red);


        JButton jb=new JButton("登录");
        jb.setSize(120,35);
        jb.setLocation(135,150);

        jb.addActionListener(e -> {
            String dlyhm = jt.getText();
            String mm=new String(jt2.getPassword());
            String yzm1 = jt3.getText();
            if ((dlyhm.equals(AL.get(0)))&(mm.equals(AL.get(1)))&(yzm1.equalsIgnoreCase(yzm))){
                System.out.println("登录成功");
                this.dispose();
                alcsz csz=new alcsz();
            }else {
                System.out.println("登录失败！");
            }
        });

        jp1.add(jb);
        jp1.add(jl1);
        jp1.add(jl2);
        jp1.add(jl3);
        jp1.add(jl4);
        jtp.addTab("登录",jp1);
        this.add(jtp);
    } //登录界面
    private void register(){
        JPanel jp2=new JPanel();
        jp2.setLayout(null);
        JLabel jl1=new JLabel("手机号");
        jl1.setOpaque(true);
        jl1.setFont(new Font("黑体",Font.BOLD,16));
        jl1.setSize(60,40);
        jl1.setLocation(44,21);

        JTextField jt=new JTextField();
        jt.setSize(233,28);
        jt.setLocation(120,28);
        jp2.add(jt);
        jp2.add(jl1);


        JLabel jl2=new JLabel("密  码");
        //   jl2.setBackground(Color.white);
        jl2.setOpaque(true);
        jl2.setFont(new Font("黑体",Font.BOLD,16));
        jl2.setSize(60,40);
        jl2.setLocation(44,62);

        JPasswordField jt2=new JPasswordField();
        jt2.setSize(233,28);
        jt2.setLocation(120,68);
        jp2.add(jl2);
        jp2.add(jt2);

        JLabel jl3=new JLabel("确认密码");
//         jl3.setBackground(Color.white);
        jl3.setOpaque(true);
        jl3.setFont(new Font("黑体",Font.BOLD,16));
        jl3.setSize(70,40);
        jl3.setLocation(44,105);

        JPasswordField jt3=new JPasswordField();
        jt3.setSize(233,28);
        jt3.setLocation(120,108);
        jp2.add(jl3);
        jp2.add(jt3);

        JButton jb=new JButton("注册");
        jb.setSize(120,35);
        jb.setLocation(135,150);
        jp2.add(jb);
        jtp.addTab("注册",jp2);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //noinspection InstantiatingAThreadWithDefaultRunMethod
                Thread  d=new Thread();
                String text = jt.getText();
                AL.add(text);
                char[] chars = text.toCharArray();
                String password1 = new String(jt2.getPassword());
                AL.add(password1);
                String password2 = new String(jt3.getPassword());
                for (int i = 0; i < text.length(); i++) {
                    if (text.length() != 11 ) {
                        System.out.println("注册失败！手机号错误");
                        break;
                    } else if (chars[i] < 0 & chars[i] > 9) {
                        System.out.println("手机号错误！");
                        break;
                    }else if(text==""){
                        System.out.println("手机号错误！");
                        break;
                    }else if (password1.equals(password2)){
                        System.out.println("注册成功");
                        System.out.println(AL);
                        break;
                    }else {
                        System.out.println("密码错误注册失败");
                        break;
                    }
                    }
                }
            });

       //手机号码校验
    } //注册界面
}
