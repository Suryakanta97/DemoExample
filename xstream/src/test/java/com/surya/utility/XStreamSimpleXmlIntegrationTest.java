package com.surya.utility;

import com.surya.initializer.SimpleXstreamInitializer;
import com.surya.pojo.AddressDetails;
import com.surya.pojo.ContactDetails;
import com.surya.pojo.Customer;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class XStreamSimpleXmlIntegrationTest {

    private Customer customer;
    private String dataXml;
    private XStream xstream;

    @Before
    public void dataSetup() {
        customer = SimpleDataGeneration.generateData();
        SimpleXstreamInitializer simpleXstreamInitializer = new SimpleXstreamInitializer();
        xstream = simpleXstreamInitializer.getXstreamInstance();
        xstream.processAnnotations(Customer.class);
        xstream.processAnnotations(AddressDetails.class);
        xstream.processAnnotations(ContactDetails.class);
        xstream.omitField(Customer.class, "lastName");
        xstream.registerConverter(new MyDateConverter());
        // xstream.registerConverter(new MySingleValueConverter());
        xstream.aliasField("fn", Customer.class, "firstName");
        dataXml = xstream.toXML(customer);
    }

    @Test
    public void testClassAliasedAnnotation() {
        Assert.assertNotEquals(-1, dataXml.indexOf("<customer>"));
    }

    @Test
    public void testFieldAliasedAnnotation() {
        Assert.assertNotEquals(-1, dataXml.indexOf("<fn>"));
    }

    @Test
    public void testImplicitCollection() {
        Assert.assertEquals(-1, dataXml.indexOf("contactDetailsList"));
    }

    @Test
    public void testDateFieldFormating() {
        Assert.assertEquals("14-02-1986", dataXml.substring(dataXml.indexOf("<dob>") + 5, dataXml.indexOf("</dob>")));
    }

    @Test
    public void testOmitField() {
        Assert.assertEquals(-1, dataXml.indexOf("lastName"));
    }
}
