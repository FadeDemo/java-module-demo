package org.fade.demo.module.greeting;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

/**
 * @author fade
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Greetings!");
        System.out.println(ThreadFactoryBuilder.class.getModule().isNamed());
    }

}
