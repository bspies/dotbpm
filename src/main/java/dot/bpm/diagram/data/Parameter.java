/*
 * Copyright (c) 2009-2016 Brennan Spies
 *
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
package dot.bpm.diagram.data;

/**
 * Represents an input or output parameter.
 * @param <T> The parameter type
 *
 * @author Brennan Spies
 */
public class Parameter<T> {

    private final String name;

    /**
     * Creates a parameter.
     * @param name The parameter name
     * @param eval The assignment expression
     */
    public Parameter(String name, Expression eval) {
        this.name = name;
    }

    /**
     * Factory method to create a parameter.
     * @param name The parameter name
     * @param expr The parameter expression
     * @return The parameter
     */
    public static <T> Parameter<T> of(String name, Expression expr) {
        return new Parameter<>(name, expr);
    }

    /**
     * The parameter name
     * @return The parameter name
     */
    public String getName() {
        return name;
    }
}