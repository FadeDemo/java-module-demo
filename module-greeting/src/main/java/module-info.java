module module.greeting {
    // 必须要require，不然在使用Guava相关类时会无法import
    // require是require模块
    requires com.google.common;
    // 对应包下必须要有代码
    exports org.fade.demo.module.greeting;
}