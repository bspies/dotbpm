package dot.bpm.diagram.parser;

import dot.bpm.diagram.ProcessDiagram;
import dot.bpm.parser.DiagramParser;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class DiagramParserTest {

    /**
     * Parses the given dotbpm file into a process diagram.
     * @param fileName The name of the file
     * @return The process diagram
     * @throws IOException If an error occurs opening the file
     */
    private ProcessDiagram parseDiagram(String fileName) throws IOException {
        String fullFilePath = new StringBuilder()
                .append(this.getClass().getPackage().getName().replace('.', '/'))
                .append("/")
                .append(fileName)
                .toString();
        try (InputStream is = this.getClass().getClassLoader().getResourceAsStream(fullFilePath)) {
            assertNotNull("File not found: " + fileName, is);
            return DiagramParser.parse(is);
        }
    }

    @Test
    public void parseSingleTaskProcess() throws IOException {
        ProcessDiagram diagram = parseDiagram("simple_task.dotbpm");
        //assertdiagram.getNodes()
    }
}
