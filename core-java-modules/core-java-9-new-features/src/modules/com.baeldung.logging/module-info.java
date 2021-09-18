module com.surya.logging {
    provides java.lang.System.LoggerFinder
      with com.surya.logging.CustomLoggerFinder;
    exports com.surya.logging;
}