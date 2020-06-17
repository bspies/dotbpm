package dot.bpm.diagram.parser;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        { BasicTests.class, SequenceTests.class, GatewayTests.class, MessageTests.class }
)
public class ParserTestSuite {
}
