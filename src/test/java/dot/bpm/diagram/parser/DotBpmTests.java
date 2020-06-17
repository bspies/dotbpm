package dot.bpm.diagram.parser;

import dot.bpm.diagram.ProcessDiagram;
import dot.bpm.parser.DiagramParser;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertNotNull;

abstract public class DotBpmTests {
    /**
     * Parses the given dotbpm file into a process diagram.
     * @param fileName The name of the file
     * @return The process diagram
     * @throws IOException If an error occurs opening the file
     */
    protected ProcessDiagram parseDiagram(String fileName) throws IOException {
        String fullFilePath = this.getClass().getPackage().getName().replace('.', '/') +
                "/" +
                fileName;
        try (InputStream is = this.getClass().getClassLoader().getResourceAsStream(fullFilePath)) {
            assertNotNull("File not found: " + fileName, is);
            return DiagramParser.parse(is);
        }
    }
}
