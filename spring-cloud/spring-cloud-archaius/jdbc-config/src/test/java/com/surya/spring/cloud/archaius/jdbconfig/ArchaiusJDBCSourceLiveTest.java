package com.surya.spring.cloud.archaius.jdbconfig;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ArchaiusJDBCSourceLiveTest {

    private static final String BASE_URL = "http://localhost:8082";

    private static final String DYNAMIC_PROPERTIES_URL = "/properties-from-dynamic";
    private static final Map<String, String> EXPECTED_ARCHAIUS_PROPERTIES = createExpectedArchaiusProperties();

    private static Map<String, String> createExpectedArchaiusProperties() {
        Map<String, String> map = new HashMap<>();
        map.put("surya.archaius.properties.one", "one FROM:jdbc_source");
        map.put("surya.archaius.properties.two", "two FROM:application.properties");
        map.put("surya.archaius.properties.three", "three FROM:jdbc_source");
        return map;
    }

    @Autowired
    ConfigurableApplicationContext context;

    @Autowired
    private TestRestTemplate template;

    private <T> Map<T, T> exchangeAsMap(String uri, ParameterizedTypeReference<Map<T, T>> responseType) {
        return template.exchange(uri, HttpMethod.GET, null, responseType)
            .getBody();
    }

    @Test
    public void givenNonDefaultConfigurationFilesSetup_whenRequestProperties_thenEndpointRetrievesValuesInFiles() {
        Map<String, String> initialResponse = this.exchangeAsMap(BASE_URL + DYNAMIC_PROPERTIES_URL, new ParameterizedTypeReference<Map<String, String>>() {
        });

        assertThat(initialResponse).containsAllEntriesOf(EXPECTED_ARCHAIUS_PROPERTIES);
    }
}