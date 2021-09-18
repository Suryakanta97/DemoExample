module hello.modules {
    exports com.surya.modules.hello;
    provides com.surya.modules.hello.HelloInterface with com.surya.modules.hello.HelloModules;
}