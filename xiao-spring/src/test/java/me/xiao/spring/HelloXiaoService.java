package me.xiao.spring;

/**
 * service 类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 14:49
 */
public class HelloXiaoService {
    private String text;

    public void sayHello(){
        System.out.println(text);
    }

    public void setText(String text) {
        this.text = text;
    }
}
