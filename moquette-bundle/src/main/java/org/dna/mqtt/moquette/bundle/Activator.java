/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.dna.mqtt.moquette.bundle;

import org.dna.mqtt.moquette.server.Server;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Start and stop a configured version of the MQTT broker server.
 * @author Didier Donsez
 * @todo add config admin for port (in NettyAcceptor)
 */
public class Activator implements BundleActivator {
	
    private static final Logger LOG = LoggerFactory.getLogger(Server.class);

    private Server server=null;
    
	public void start(BundleContext bundleContext) throws Exception {
        server = new Server();
        server.startServer();
        LOG.info("Moquette MQTT broker started, version 0.4-SNAPSHOT");
	}

	public void stop(BundleContext bundleContext) throws Exception {
        server.stopServer();
        LOG.info("Moquette MQTT broker stopped, version 0.4-SNAPSHOT");
	}
}
