package com.jack.d2_static_code;

import java.util.ArrayList;

public class StaticDemo2 {

    /**
     * 初始化一副牌54张
     */
    public static ArrayList<String> cards = new ArrayList<>();


    static {
        //正式做牌
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♥","♠","♣","♦"};

        for (int i = 0; i < sizes.length; i++) {
            for (int i1 = 0; i1 < colors.length; i1++) {
                String card = colors[i1] + sizes[i];
                cards.add(card);
            }
        }

        cards.add("小王");
        cards.add("大王");

    }

    public static void main(String[] args) {
        System.out.println(cards);
        System.out.println(cards.size());
    }
}
