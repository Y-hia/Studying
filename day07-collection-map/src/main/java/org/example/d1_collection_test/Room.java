package org.example.d1_collection_test;

import java.util.*;


public class Room {
    //1、创建一个集合，用于存储牌
    private final ArrayList<Card> allCards = new ArrayList<>();
    //2、初始化牌：数字
    String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
    // 3、初始化牌：花色
    String[] colors = {"♣", "♥", "♠", "♦"};
    int size = 0;
    //4、将花色和数字添加到集合中
    {
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                // 创建一个牌对象,并将牌对象存在集合里面
                allCards.add(new Card(number, color,size));
            }
        }
        allCards.add(new Card("小王", "🃏",++size));
        allCards.add(new Card("大王", "🃏",++size));
    }
    public void startGame() {
        System.out.println("新牌是：" + allCards);
        //新牌初始化好以后，洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后：" + allCards);
        //发牌
        //1、定义三个集合，分别存储玩家的牌，底牌
        //2、定义地主牌
        Random r = new Random();
        int index = r.nextInt(allCards.size()-3);
        //定义三个玩家的集合
        List<Card> LBW = new ArrayList<>();
        List<Card> XXBB = new ArrayList<>();
        List<Card> QZ = new ArrayList<>();
        //3、底牌
        List<Card> cards = allCards.subList(allCards.size() - 3, allCards.size());
        System.out.println("底牌是：" + cards);
        //4、遍历集合，给三位玩家发牌
        for (int i = 0; i < allCards.size() - 3; i++) {
            if(i % 3 == 0){
                LBW.add(allCards.get(i));
            }else if(i % 3 == 1){
                XXBB.add(allCards.get(i));
            }else{
                QZ.add(allCards.get(i));
            }
        }
        if (index % 3 == 0){
            LBW.addAll(cards);
            System.out.println("LBW是地主");
        }else if(index % 3 == 1){
            XXBB.addAll(cards);
            System.out.println("XXBB是地主");
        }else{
            QZ.addAll(cards);
            System.out.println("QZ是地主");
        }
        //5、将玩家的牌进行排序
        sortCard(LBW);
        sortCard(XXBB);
        sortCard(QZ);
        System.out.println("LBW  的牌是"+ LBW);
        System.out.println("XXBB 的牌是"+ XXBB);
        System.out.println("QZ   的牌是"+ QZ);
        System.out.println("==========牌已经发完==========");
    }

    private void sortCard(List<Card> LBW) {
        LBW.sort(new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getSize() - o2.getSize();
            }
        });
    }
}
