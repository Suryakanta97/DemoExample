package com.surya.guice;

import com.surya.guice.config.DependencyModule;
import com.surya.guice.service.DataPumpService;
import com.surya.guice.service.ServiceFactory;
import com.surya.guice.service.impl.DataPumpServiceImpl;

import ratpack.guice.Guice;
import ratpack.server.RatpackServer;

public class Application {

	public static void main(String[] args) throws Exception {

		RatpackServer
				.start(server -> server.registry(Guice.registry(bindings -> bindings.module(DependencyModule.class)))
						.handlers(chain -> chain.get("randomString", ctx -> {
							DataPumpService dataPumpService = ctx.get(DataPumpService.class);
							ctx.render(dataPumpService.generate());
						}).get("factory", ctx -> ctx.render(ServiceFactory.getInstance().generate()))));

//		RatpackServer.start(server -> server
//				.registry(Guice
//						.registry(bindings -> bindings.bindInstance(DataPumpService.class, new DataPumpServiceImpl())))
//				.handlers(chain -> chain.get("randomString", ctx -> {
//					DataPumpService dataPumpService = ctx.get(DataPumpService.class);
//					ctx.render(dataPumpService.generate());
//				}).get("factory", ctx -> ctx.render(ServiceFactory.getInstance().generate()))));

	}

}