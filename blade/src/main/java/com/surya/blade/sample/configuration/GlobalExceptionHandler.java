package com.surya.blade.sample.configuration;

import com.blade.ioc.annotation.Bean;
import com.blade.mvc.WebContext;
import com.blade.mvc.handler.DefaultExceptionHandler;

@Bean
public class GlobalExceptionHandler extends DefaultExceptionHandler {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @Override
    public void handle(Exception e) {
        if (e instanceof suryaException) {
            Exception suryaException = (suryaException) e;
            String msg = suryaException.getMessage();
            log.error("[GlobalExceptionHandler] Intercepted an exception to threat with additional logic. Error message: " + msg);
            WebContext.response()
                .render("index.html");

        } else {
            super.handle(e);
        }
    }
}