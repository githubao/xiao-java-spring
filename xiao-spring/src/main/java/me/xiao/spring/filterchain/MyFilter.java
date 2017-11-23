package me.xiao.spring.filterchain;

import java.util.List;

/**
 * 过滤器
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/11/23 14:25
 */

public interface MyFilter {

    void doFilter(List<Integer> numbers);

    void setNext(MyFilter filter);

    MyFilter getNext();

    MyFilter getLast();
}
