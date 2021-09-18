
package com.surya.examples.guice.binding;

import com.surya.examples.guice.aop.MessageLogger;
import com.surya.examples.guice.aop.MessageSentLoggable;
import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

/**
 *
 * @author surya
 */
public class AOPModule extends AbstractModule {

    @Override
    protected void configure() {
        bindInterceptor(Matchers.any(),
                Matchers.annotatedWith(MessageSentLoggable.class),
                new MessageLogger()
        );
    }

}
