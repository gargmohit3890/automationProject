package com.example.automationProject;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/hello.json" }, features = "classpath:features")
public class CucumberRunnerTest {

}
