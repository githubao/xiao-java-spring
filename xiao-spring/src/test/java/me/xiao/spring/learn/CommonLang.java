package me.xiao.spring.learn;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * common language
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/11/21 10:38
 */

public class CommonLang {

    @Test
    public void testCommonLang() {

        List<Class> classes = Arrays.asList(
                StringUtils.class);

        for (Class clazz : classes) {
            System.out.println(clazz.getCanonicalName());
        }

    }
}
