package me.xiao.spring.filterchain;

/**
 * 抽象的过滤链
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/11/23 14:30
 */

public abstract class AbstractMyFilter implements MyFilter{

    private MyFilter next;

    @Override
    public void setNext(MyFilter filter) {
        this.next = filter;
    }

    @Override
    public MyFilter getNext() {
        return next;
    }

    @Override
    public MyFilter getLast() {
        MyFilter current = this;

        while (current.getNext() != null){
            current = current.getNext();
        }

        return current;
    }
}
