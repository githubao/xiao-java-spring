package me.xiao.spring;

import org.junit.Assert;

/**
 * 输出 服务
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 22:37
 */
public class OutputService {
    private HelloXiaoServiceImpl helloXiaoService;
//    private HelloXiaoService helloXiaoService;

    public void output(String text) {
        Assert.assertNotNull(helloXiaoService);
        System.out.println(text);
    }

    public void setHelloXiaoService(HelloXiaoServiceImpl helloXiaoService) {
        this.helloXiaoService = helloXiaoService;
    }

    public HelloXiaoServiceImpl getHelloXiaoService() {
        return helloXiaoService;
    }


}
