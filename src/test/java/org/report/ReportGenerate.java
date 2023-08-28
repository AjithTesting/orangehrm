package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGenerate {
public static void generatReport(String str) {
	// TODO Auto-generated method stub
File file=new File("target");
Configuration con=new Configuration(file,"OrangeHrProject");
con.addClassifications("user","magneto");
List<String> li=new LinkedList<String>();
li.add(str);
ReportBuilder r=new ReportBuilder(li,con);
r.generateReports();
}
}
