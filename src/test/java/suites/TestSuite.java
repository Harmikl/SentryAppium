package suites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        SignInUpTests.class,
        MarketwatchTests.class,
        MenuTests.class
})
public class TestSuite {
}


