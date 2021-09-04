package com.surya.blade.sample.interceptors;

import com.blade.ioc.annotation.Bean;
import com.blade.mvc.RouteContext;
import com.blade.mvc.hook.WebHook;

@Bean
public class suryaHook implements WebHook {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(suryaHook.class);

    @Override
    public boolean before(RouteContext ctx) {
        log.info("[suryaHook] called before Route method");
        return true;
    }
}