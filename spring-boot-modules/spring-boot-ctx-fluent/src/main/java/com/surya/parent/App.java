package com.surya.parent;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.surya.ctx1.Ctx1Config;
import com.surya.ctx2.Ctx2Config;

public class App {
    public static void main(String[] args) {
        new SpringApplicationBuilder().parent(ParentConfig.class)
            .web(WebApplicationType.NONE)
            .child(Ctx1Config.class)
            .web(WebApplicationType.SERVLET)
            .sibling(Ctx2Config.class)
            .web(WebApplicationType.SERVLET)
            .run(args);
    }
}
