package com.itheima.demo;
import java.util.Random;
public class yzm {
    public static void main(String[] args) {
        String s = creatCode(3);
        System.out.println(s);
    }
    //定义一个方法返回一个随机验证码
    public static String creatCode(int n) {
        //定义一个字符串变量 记录生成的随机数
        String code = "";
        Random r = new Random();
        //2.在方法内部使用for循环生成指定位数的随机字符，并连接起来
        for (int i = 0; i <= n; i++) {
            //生成一个随机字符：大写 ，小写 ，数字（0  1  2）
            int type = r.nextInt(3);
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
}


