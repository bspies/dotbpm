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

import dot.bpm.service.ServiceInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * The process configuration.
 *
 * @author Brennan Spies
 */
public class ProcessConfiguration {

    public static final String defaultNamespace = "urn:dotbpm:process";

    private final Collection<String> namespaces = new HashSet<>();
    private final Collection<ServiceInterface> services = new ArrayList<>();
    private final Collection<String> partnerProcesses = new HashSet<>();
    private final Collection<String> scriptingLanguages = new HashSet<>();
    private String expressionLanguage;

    public ProcessConfiguration() {
        namespaces.add(defaultNamespace);
    }

    public String getExpressionLanguage() {
        return expressionLanguage;
    }

    public void setExpressionLanguage(String expressionLanguage) {
        this.expressionLanguage = expressionLanguage;
    }

    public Collection<String> getNamespaces() {
        return namespaces;
    }

    public void addNamespace(String namespace) {
        namespaces.add(namespace);
    }

    public void addScriptingLanguage(String language) {
        scriptingLanguages.add(language);
    }

    public Collection<String> getScriptingLanguages() {
        return scriptingLanguages;
    }
}
