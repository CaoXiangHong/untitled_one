package cn.hb.mr;

import java.util.ArrayList;

public class DouDIZhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String [] colors = { "♠","♥","♣","♦"};
        String [] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");

        for (String  number: numbers){
            for (String color:colors){
                System.out.println(color+number);
            }
        }

    }
}
