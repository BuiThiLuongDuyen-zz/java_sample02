package com.company;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        // write your code here

        //型パラメータ
        ArrayList<Integer> testList = new ArrayList<>();
        ArrayList<Object> testList01 = new ArrayList<>();//キャストがダメ

        testList.add(0);
        testList.add(1);
        testList.add(3);
        testList.add(5);
        testList.add(6);
        testList.add(7);
        testList.add(8);
        testList.add(9);
        testList.add(10);
        //testList.stream().forEach(i -> System.out.println(i));//int型受け取って
        //testList.stream().map(i -> i + 10).forEach(i -> System.out.println(i));//iを+10
//        testList.stream()
//                .map(i -> {
//                    return i + 10;
//                })
//                .filter(i -> i < 19)
//                .forEach(i -> System.out.println(i));//filter boolean True of False
        List<Integer> al = testList.stream()
                                        .map(i -> {
                                            return i + "mojiretsu";
                                        })
                                        .filter(i -> i.length() < 10)
                                        .collect(Collectors.toList());
        for(String i : al){
            System.out.println(i);
        }




//        testList01.add("test");//追加する
//        Object p = testList01.get(0);//index 0の要素をとる
//        System.out.println(p);

        //HashMap順序維持しない
        //HashMapキーの値をハッシュ化する→ハッシュの順序
        HashMap<String, Integer> hm = new HashMap<String , Integer>();
        hm.put("tmp0", 0);
        hm.put("tmp1", 1);
        hm.put("tmp2", 2);
        //hm.put("tmp2", "tmp");ダメな例
        for(int i : hm.values()){     //リスト要素少しずつ取り出す
            System.out.println(i);

        }


        //TreeMap:順序よく、探索が早い、
        //ハッシュの方が探索が良い
        //赤黒木
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
        tm.put("hm0", 0);
        tm.put("hm1", 1);
        tm.put("hm2", 2);
        for(int i : tm.values()){
            System.out.println(i);
        }

        //Listに近い；順序ない；集合
        HashSet<Integer> hs = new HashSet<>();
        hs.add(0);
        hs.add(6);
        hs.add(2);
        hs.add(7);
        hs.add(8);
        for(int i : hs) {
            System.out.println(i);
        }


        Queue<Integer> q= new LinkedBlockingDeque<>();
        q.add(10);
        q.add(11);
        q.add(12);
        q.add(13);

        while( q.peek() != null){      //取り出しものがnullでなかったら、; pollは取り出し→削除
            System.out.println((q.poll()));  //中身があるかどうかをチェック
        }


        int i = 0;
        //int rnd = new Random().nextInt(2);//乱数１回にシードにするように
        Random buf = new Random();//Random インスタンス

        while (true) {
            {
                int rnd = buf.nextInt(2);//乱数生成
                if (rnd == 0)
                    System.out.println("ズン");

                if (rnd == 1)
                    System.out.println("ドコ");

                switch (rnd){
                    case 0:
                        i++;
                        break;

                    case 1:
                        if(i>4) {
                            System.out.println("キ・ヨ・シ");
                            return;
                        }
                        i=0;
                }

            }


        }


    }
}

