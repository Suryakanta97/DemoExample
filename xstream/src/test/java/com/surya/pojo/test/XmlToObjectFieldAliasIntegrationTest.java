package com.surya.pojo.test;

import com.surya.initializer.SimpleXstreamInitializer;
import com.surya.pojo.Customer;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class XmlToObjectFieldAliasIntegrationTest {

    private XStream xstream = null;

    @Before
    public void dataSetup() {
        SimpleXstreamInitializer simpleXstreamInitializer = new SimpleXstreamInitializer();
        xstream = simpleXstreamInitializer.getXstreamInstance();
        xstream.alias("customer", Customer.class);
        xstream.aliasField("fn", Customer.class, "firstName");
    }

    @Test
    public void convertXmlToObjectFromFile() throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        FileReader reader = new FileReader(classLoader
          .getResource("data-file-alias-field.xml")
          .getFile());
        Customer customer = (Customer) xstream.fromXML(reader);
        Assert.assertNotNull(customer);
        Assert.assertNotNull(customer.getFirstName());
    }

}
