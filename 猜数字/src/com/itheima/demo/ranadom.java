package com.itheima.demo;
import java.util.Random;
import java.util.Scanner;
public class ranadom {
    public static void main(String[] args) {
        Random r=new Random();
        int i = r.nextInt(101);
        Scanner scanner=new Scanner(System.in);
        System.out.println("开始猜数字啦~请输入您的数字");
        while (true){
            int sc= scanner.nextInt();
            if (sc<i){
                System.out.println("太小啦~");
            }else if(sc>i){
                System.out.println("太大了~~");
            }else if (sc==i){
                System.out.println("恭喜你猜对了！");
            }
        }
    }
}
