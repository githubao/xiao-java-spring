package me.xiao.spring.filterchain;

import java.util.List;

/**
 * 过滤链
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/11/23 14:26
 */

public class MyFilterChain {

    private MyFilter chain;

    public void addFilter(MyFilter filter) {
        if (chain == null) {
            chain = filter;
        } else {
            chain.getLast().setNext(filter);
        }
    }

    public void filter(List<Integer> numbers) {
        MyFilter current = chain;

        while (true) {
            current.doFilter(numbers);
            current = current.getNext();
            if (current == null) {
                break;
            }
        }
    }

}
