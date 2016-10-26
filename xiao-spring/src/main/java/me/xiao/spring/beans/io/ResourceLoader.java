package me.xiao.spring.beans.io;

import java.net.URL;

/**
 * 根据位置，加载资源
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 17:53
 */
public class ResourceLoader {

    public Resource getResource(String location) {
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }

}
