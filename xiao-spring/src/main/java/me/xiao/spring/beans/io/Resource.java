package me.xiao.spring.beans.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 内部资源定位的总入口
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 17:53
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
