package me.xiao.spring.generic;

import java.util.GregorianCalendar;

/**
 * 理解泛型类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 21:50
 */

class Demo<T extends Comparable<? super T>>{
    public void sayHello() {
        System.out.println("hhh");
    }

}
//class Demo<T extends Comparable<T>>{}

public class LearnGeneric {

    public static void main(String[] args) {
        Demo<GregorianCalendar> demo = new Demo<>();
        demo.sayHello();
    }

    /**
     * 实际上：
     * Calendar implements Comparable<Calendar>
     *
     * 如果这样，相当于：
     * T extends Comparable<T> equals to GregorianCalendar implements Comparable<GregorianCalendar>
     *
     * 如果这样，相当于：
     * T extends Comparable<? super T> equals to GregorianCalendar implements Comparable<Calendar>
     *
     * 子类只要实现了父类的比较器，就可以用父类的比较器进行比较。
     * 然而，网demo里面加的内容，必须是限定上限类型的。
     *
     */

}
