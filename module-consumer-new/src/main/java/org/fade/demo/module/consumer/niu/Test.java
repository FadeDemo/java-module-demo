package org.fade.demo.module.consumer.niu;

import org.fade.demo.module.consumer.Main;

/**
 * @author fade
 */
public class Test {

    public static void main(String[] args) {
        /*
        --module-path
        "D:/IDEAProjects/java-module-demo/module-consumer/target;D:/IDEAProjects/java-module-demo/module-consumer-new/target;D:/IDEAProjects/java-module-demo/module-greeting/target;D:\apache-maven\maven-repository\com\google\guava\guava\32.0.1-jre"
        */
        // or
        /*
         --upgrade-module-path D:\IDEAProjects\java-module-demo\module-consumer\target
         */
        Main main = new Main();
        main.hello();
    }

}
