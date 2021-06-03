package io.yovelas.struct.demo;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("abc",1234);
        map.put("abc1",343);
        map.put("abc2",4324);
        map.put("abc3",23432);
        map.put("abc4",1223434);

        Set<Map.Entry<String,Integer>> set = map.entrySet();
        Iterator<Map.Entry<String,Integer>> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        Properties pr = new Properties();
        pr.setProperty("admin", "yove");
        pr.setProperty("passwrod", "122345");
        pr.setProperty("abc", "324");
        pr.setProperty("edf", "23432");

        System.out.println("-------------------------");

        Set set1 = pr.entrySet();
        Iterator it1 = set1.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

    }
}
