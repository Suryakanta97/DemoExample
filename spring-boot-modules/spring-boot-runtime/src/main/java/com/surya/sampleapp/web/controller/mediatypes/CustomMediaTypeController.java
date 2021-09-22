package com.surya.sampleapp.web.controller.mediatypes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.surya.sampleapp.web.dto.suryaItem;
import com.surya.sampleapp.web.dto.suryaItemV2;

@RestController
@RequestMapping(value = "/", produces = "application/vnd.surya.api.v1+json")
public class CustomMediaTypeController {

    @RequestMapping(method = RequestMethod.GET, value = "/public/api/items/{id}", produces = "application/vnd.surya.api.v1+json")
    public @ResponseBody suryaItem getItem(@PathVariable("id") String id) {
        return new suryaItem("itemId1");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/public/api/items/{id}", produces = "application/vnd.surya.api.v2+json")
    public @ResponseBody suryaItemV2 getItemSecondAPIVersion(@PathVariable("id") String id) {
        return new suryaItemV2("itemName");
    }
}
