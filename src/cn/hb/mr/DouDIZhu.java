package cn.hb.mr;


import java.util.ArrayList;
import java.util.Collections;

public class DouDIZhu {


    public  void start(String p1,String p2,String p3) {
        ArrayList<String> poker = new ArrayList<>();
        String [] colors = { "♠","♥","♣","♦"};
        String [] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");

        for (String  number: numbers){
            for (String color:colors){
                //System.out.println(color+number);
                poker.add(color+number);
            }
        }
        //System.out.println(poker);
        Collections.shuffle(poker);
        //System.out.println(poker);
        ArrayList<String > player01 = new ArrayList<>();
        ArrayList<String > player02 = new ArrayList<>();
        ArrayList<String > player03 = new ArrayList<>();
        ArrayList<String > diPai = new ArrayList<>();

        for (int i = 0 ; i < poker.size(); i++){
            String p = poker.get(i);

            if (i>=51) {
                diPai.add(p);
            }else if (i%3 == 0){
                player01.add(p);
                Collections.sort(player01);
            }else if (i%3 == 1){
                player02.add(p);
                Collections.sort(player02);

            }else if (i%3 == 2){
                player03.add(p);
                Collections.sort(player03);

            }

        }
        System.out.println(p1 + player01);
        System.out.println(p2 + player02);
        System.out.println(p3 + player03);
        System.out.println("底牌"+diPai);
    }
}
