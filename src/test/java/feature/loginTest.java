package feature;

import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(OctaneCucumber.class)
@CucumberOptions(plugin={"junit:junitResult.xml"},
        features= "src/test/resources/feature/login2-2125.feature_back")
public class loginTest{

}
