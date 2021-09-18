module com.surya.logging.slf4j {
    requires org.slf4j;
    provides java.lang.System.LoggerFinder
      with com.surya.logging.slf4j.Slf4jLoggerFinder;
    exports com.surya.logging.slf4j;
}