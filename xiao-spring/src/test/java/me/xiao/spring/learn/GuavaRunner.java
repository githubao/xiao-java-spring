package me.xiao.spring.learn;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * google guava apis
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/11/21 10:38
 */

public class GuavaRunner {
    @Test
    public void testGuava() {

        List<Class> classes = Arrays.asList(
                ImmutableMap.class);

        for (Class clazz : classes) {
            System.out.println(clazz.getCanonicalName());
        }

    }
}
