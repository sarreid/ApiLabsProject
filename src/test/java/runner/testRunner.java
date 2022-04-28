package runner;

public class testRunner {
}

//package runner;
////
////import com.intuit.karate.Results;
////import com.intuit.karate.Runner;
////import org.junit.After;
////import org.junit.Assert;
////import utils.testrail.exceptions.NoTestRailUrlException;
////import utils.testrail.exceptions.ProjectNotFoundException;
////import utils.testrail.handlers.TestRailIntegrationImp;
//
////import java.io.IOException;
//
//        import org.junit.runner.RunWith;
//        import com.intuit.karate.junit5.Karate;
//
//@RunWith(Karate.class)
//public class testRunner {
//
//}
//
////public class BaseRunner {
////
////    final String path = null;
////    final String tags;
////    final int threadCount;
////
////    public void testRunner(final String path, final String tags, final int threadCount) {
////        this.path = path;
////        this.tags = tags;
////        this.threadCount = threadCount;
////
////    }
////
////    public BaseRunner(String tags, int threadCount) {
////        this.tags = tags;
////        this.threadCount = threadCount;
////    }
////
////    @After
////    public void updateTestRail() throws ProjectNotFoundException, NoTestRailUrlException, IOException {
////        TestRailIntegrationImp.update();
////    }
////
////    protected void runTests() {
////        Results results = Runner.path(path).tags(tags).parallel(threadCount);
////        Assert.assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
////    }
////}
