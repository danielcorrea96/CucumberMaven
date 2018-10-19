package com.accenture.cucumbermaven.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features", 
		tags= {"@Feature1","@tag1"},
		glue = {"com.accenture.cucumbermaven.step_definitions"},
		snippets = SnippetType.UNDERSCORE,
		monochrome = true,
		dryRun = false,
		plugin = {"json:reportJson/cucumber.json"}
)
public class Runner {}
