package com.surya.soap.ws.server;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.surya.soap.ws.server.CountryService")
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository = new CountryRepository();

    @Override
    public Country findByName(String name) {
        return countryRepository.findCountry(name);
    }

}
