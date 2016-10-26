package me.xiao.spring;

import java.util.Random;

/**
 * service 实现类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/26 20:46
 */
public class HelloXiaoServiceImpl implements HelloXiaoService {
    private String text;

    private OutputService outputService;

    @Override
    public void sayHello() {
        int rand = new Random().nextInt(1000);

        try {
            Thread.sleep(rand);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        outputService.output(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }

}
