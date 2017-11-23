package me.xiao.spring.filterchain;


import com.google.common.primitives.ImmutableIntArray;
import com.google.common.primitives.Ints;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 过滤链测试
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/11/23 14:36
 */

public class MyFilterTest {

    @Test
    public void testChain() {
        MyFilterChain chain = new MyFilterChain();
        chain.addFilter(new FirstMyFilter());
        chain.addFilter(new SecondMyFilter());

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3));

        chain.filter(numbers);

        System.out.println(numbers);

    }
}