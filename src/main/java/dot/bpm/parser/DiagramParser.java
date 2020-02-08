/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dot.bpm.parser;

import dot.bpm.diagram.ProcessDiagram;
import dot.bpm.parser.antlr.DOTBPMLexer;
import dot.bpm.parser.antlr.DOTBPMParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

/**
 * A parser for DotBPM diagrams.
 */
public class DiagramParser {
    public static ProcessDiagram parse(InputStream inputStream) throws IOException {
        DOTBPMLexer lexer;
        DOTBPMParser parser;
        lexer = new DOTBPMLexer(CharStreams.fromStream(inputStream));
        parser = new DOTBPMParser(new CommonTokenStream(lexer));
        DiagramParseListener listener = new DiagramParseListener();
        parser.addParseListener(listener);
        // error handlers
        ParseTree tree = parser.process();
        return listener.getProcessDiagram();
    }
}
