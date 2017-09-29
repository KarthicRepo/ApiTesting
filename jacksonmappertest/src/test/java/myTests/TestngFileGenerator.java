package myTests;

import utilities.XLSReader;

public class TestngFileGenerator {

	public static void main(String[] args) {
		XLSReader suite = new XLSReader("src/main/resources/Test.xlsx");
		suite.getTests("select * from TestCase where module='index'");
	}

}
