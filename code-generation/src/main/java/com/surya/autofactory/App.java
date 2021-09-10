package com.surya.autofactory;

import com.surya.autofactory.model.Camera;
import com.surya.autofactory.model.Phone;
import com.surya.autofactory.model.PhoneFactory;
import com.surya.autofactory.modules.SonyCameraModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory(() -> new Camera("Unknown", "XXX"));
        Phone simplePhone = phoneFactory.create("other parts");

        Injector injector = Guice.createInjector(new SonyCameraModule());
        PhoneFactory injectedFactory = injector.getInstance(PhoneFactory.class);
        Phone xperia = injectedFactory.create("Xperia");
    }

}
