package com.example.automationProject;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = CucumberApp.class, loader = SpringBootContextLoader.class)
class AutomationProjectApplicationTests {

	@Test
	void contextLoads() {
	}

}
