package feature;

import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(OctaneCucumber.class)
@CucumberOptions(plugin={"junit:junitResult.xml"},
        features= "src/test/resources/feature/login 2-2124.feature_back")
public class loginTest{

}
