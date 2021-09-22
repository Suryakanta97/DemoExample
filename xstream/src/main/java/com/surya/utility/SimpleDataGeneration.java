package com.surya.utility;

import com.surya.pojo.ContactDetails;
import com.surya.pojo.Customer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SimpleDataGeneration {

    public static Customer generateData() {
        Customer customer = new Customer();
        Calendar cal = Calendar.getInstance();
        cal.set(1986, 01, 14);
        customer.setDob(cal.getTime());
        customer.setFirstName("XStream");
        customer.setLastName("Java");

        List<ContactDetails> contactDetailsList = new ArrayList<ContactDetails>();

        ContactDetails contactDetails1 = new ContactDetails();
        contactDetails1.setLandline("0124-2460311");
        contactDetails1.setMobile("6673543265");

        ContactDetails contactDetails2 = new ContactDetails();
        contactDetails2.setLandline("0120-223312");
        contactDetails2.setMobile("4676543565");

        contactDetailsList.add(contactDetails1);
        contactDetailsList.add(contactDetails2);

        customer.setContactDetailsList(contactDetailsList);
        return customer;
    }

}