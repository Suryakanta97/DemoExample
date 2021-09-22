package com.surya.guice.config;

import com.surya.guice.service.DataPumpService;
import com.surya.guice.service.impl.DataPumpServiceImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class DependencyModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(DataPumpService.class).to(DataPumpServiceImpl.class)
		  .in(Scopes.SINGLETON);
	}

}
