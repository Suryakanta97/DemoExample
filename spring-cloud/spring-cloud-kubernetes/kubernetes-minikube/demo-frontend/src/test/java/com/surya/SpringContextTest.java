package com.surya;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.surya.spring.cloud.kubernetes.frontend.KubernetesFrontendApplication;

@SpringBootTest(classes = KubernetesFrontendApplication.class)
public class SpringContextTest {

	@Test
	public void contextLoads() {
	}

}
