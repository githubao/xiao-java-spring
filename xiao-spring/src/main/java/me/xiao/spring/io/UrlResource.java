package me.xiao.spring.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * 根据url获取资源
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/25 17:54
 */
public class UrlResource implements Resource {
    private final URL url;

    public UrlResource(URL url) {
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
