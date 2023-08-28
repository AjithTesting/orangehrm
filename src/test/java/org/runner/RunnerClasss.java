package org.runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportGenerate;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\OrangeHrProject\\src\\test\\resources\\featuredfilefolder\\myfeaturefile.feature",glue="org.step",dryRun=false
,monochrome=true,plugin= {   "html:target\\htmlreport",
							 "junit:target\\junitreport.xml",
							 "json:target\\jsonreport.json"	
})

public class RunnerClasss {
@AfterClass
public static void start() {
	ReportGenerate.generatReport("target\\jsonreport.json");
}
}
