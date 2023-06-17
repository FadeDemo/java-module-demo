package org.fade.demo.module.consumer.niu;

import org.fade.demo.module.greeting.ThreadUtils;

/**
 * @author fade
 */
public class Main {

    public static void main(String[] args) {
        ThreadUtils.getThreadFactory("Test-%d");
        System.out.println(ThreadUtils.class.getModule().isNamed());
    }

}
