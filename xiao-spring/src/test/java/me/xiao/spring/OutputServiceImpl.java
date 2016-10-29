package me.xiao.spring;

import java.util.Random;

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
        int rand = new Random().nextInt(1000);

        try {
            Thread.sleep(rand);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(text);
    }


}
