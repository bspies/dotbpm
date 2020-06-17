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
package dot.bpm.core;

import dot.bpm.diagram.ProcessDiagram;

/**
 * A process definition, including the diagram and other metadata.
 *
 * @author Brennan Spies
 */
public class ProcessDefinition {

    private final ProcessConfiguration processConfiguration;
    private final ProcessDiagram processDiagram;

    public ProcessDefinition(ProcessConfiguration configuration, ProcessDiagram processDiagram) {
        this.processConfiguration = configuration;
        this.processDiagram = processDiagram;
    }

    /**
     * Returns the process diagram.
     * @return The process diagram
     */
    public ProcessDiagram getProcessDiagram() {
        return processDiagram;
    }

    /**
     * Returns the default expression language for the process.
     * @return The default expression language
     */
    public String getExpressionLanguage() {
        return processConfiguration.getExpressionLanguage();
    }
}
