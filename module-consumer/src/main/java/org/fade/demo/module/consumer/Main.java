package org.fade.demo.module.consumer;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.fade.demo.module.greeting.ThreadUtils;

import java.util.concurrent.ThreadFactory;

/**
 * @author fade
 */
public class Main {

    public static void main(String[] args) {
        ThreadFactory threadFactory = ThreadUtils.getThreadFactory("Test-%d");
        new ThreadFactoryBuilder();
        System.out.println(ThreadUtils.class.getModule().isNamed());
    }

    public void hello() {
        System.out.println("Hello");
    }

}
