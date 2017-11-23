package me.xiao.spring.learn;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByKey;

/**
 * 由泛型引起的堆污染
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/11/21 14:55
 */

public class HeapPolution {

    @Test
    public void testHeapPollution() {
        ArrayList<Integer> list = new ArrayList<>();

        ArrayList wildList = list;
        wildList.add("aaa");

        for (Integer a : list) {
            System.out.println(a);
        }

        HashMap<String, Integer> map = new HashMap<>();

        for (Map.Entry<String, Integer> entry: map.entrySet()){

        }


//        Comparator<Map.Entry<Integer, String>> entryComparator = comparingByKey();



        Comparator<Map.Entry<String, Object>> entryComparator = Map.Entry.<String,Object>comparingByKey();



        Map.Entry.<String,Integer>comparingByKey();

    }

}
