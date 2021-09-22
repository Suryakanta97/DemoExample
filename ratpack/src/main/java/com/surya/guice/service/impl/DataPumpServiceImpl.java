package com.surya.guice.service.impl;

import java.util.UUID;

import com.surya.guice.service.DataPumpService;

public class DataPumpServiceImpl implements DataPumpService {

	@Override
	public String generate() {
		return UUID.randomUUID().toString();
	}

}
