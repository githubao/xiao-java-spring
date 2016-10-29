package me.xiao.spring;

/**
 * 输出实现类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/28 22:03
 */
public class OutputServiceImpl implements OutputService{

    @Override
    public void output(String text) {
        System.out.println(text);
    }


}
