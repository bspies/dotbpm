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
package dot.bpm.diagram.gateways;

import dot.bpm.diagram.BaseFlowNode;
import dot.bpm.diagram.Lane;

/**
 * A node that represents a gateway, i.e. one that controls the process flow.
 *
 * @author Brennan Spies
 */
public class GatewayNode extends BaseFlowNode {

    private final GatewayBehavior gatewayBehavior;

    public GatewayNode(String id, Lane lane, GatewayBehavior gatewayBehavior) {
        super(id, lane);
        this.gatewayBehavior = gatewayBehavior;
    }

    public GatewayBehavior getGatewayBehavior() {
        return gatewayBehavior;
    }
}
