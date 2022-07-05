package com.itheima.demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class iol {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(demo.class.getClassLoader().getResourceAsStream("names.txt"));
        BufferedReader br=new BufferedReader(reader);
        String line;
    while ((line= br.readLine())!=null){
        System.out.println(line);
    }
    br.close();

    }
}
