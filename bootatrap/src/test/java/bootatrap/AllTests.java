package bootatrap;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import utils.freemarker.FreemarkerUtilTest;

@RunWith(Suite.class)
@SuiteClasses({ QqqqTest.class, QqqqTest2.class,Qqqq.class,FreemarkerUtilTest.class })
public class AllTests {

}
