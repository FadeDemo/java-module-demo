package org.fade.demo.module.greeting;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.ThreadFactory;

/**
 * @author fade
 */
public class ThreadUtils {

    /**
     * 以Google guava的方式创建线程工厂
     * */
    public static ThreadFactory getThreadFactory(String format) {
        return new ThreadFactoryBuilder()
                .setDaemon(false)
                .setPriority(Thread.NORM_PRIORITY)
                .setNameFormat(format).build();
    }

}
