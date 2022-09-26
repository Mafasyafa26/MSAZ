package ujian.ujiankelima.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/test/resources/ujian/ujiankelima/01Login.feature",
		"src/test/resources/ujian/ujiankelima/02Regist.feature"
		},
glue = "ujian.ujiankelima.cucumber",
monochrome=true,
plugin = {"pretty","html:target/ujian/ujiankelima/UjianKelima.html",
		"json:target/ujian/ujiankelima/UjianKelima.json",
		"junit:target//ujian/ujiankelima/UjianKelima.xml"})
public class RoadRunner extends AbstractTestNGCucumberTests{
	
}
