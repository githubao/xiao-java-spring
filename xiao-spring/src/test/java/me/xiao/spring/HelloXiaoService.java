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

    private OutputService outputService;

    public void sayHello() {
        outputService.output(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }
}
