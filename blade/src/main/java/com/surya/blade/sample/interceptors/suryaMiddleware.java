package com.surya.blade.sample.interceptors;

import com.blade.mvc.RouteContext;
import com.blade.mvc.hook.WebHook;

public class suryaMiddleware implements WebHook {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(suryaMiddleware.class);

    @Override
    public boolean before(RouteContext context) {
        log.info("[suryaMiddleware] called before Route method and other WebHooks");
        return true;
    }
}