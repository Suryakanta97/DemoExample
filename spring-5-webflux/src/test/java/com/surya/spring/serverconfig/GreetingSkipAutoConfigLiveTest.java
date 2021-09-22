package com.surya.spring.serverconfig;

import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("skipAutoConfig")
public class GreetingSkipAutoConfigLiveTest extends GreetingLiveTest {

}
