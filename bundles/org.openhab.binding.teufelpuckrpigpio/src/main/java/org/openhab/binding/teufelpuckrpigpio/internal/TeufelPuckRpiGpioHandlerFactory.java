/**
 * Copyright (c) 2010-2022 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.teufelpuckrpigpio.internal;

import static org.openhab.binding.teufelpuckrpigpio.internal.TeufelPuckRpiGpioBindingConstants.*;

import java.util.Set;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.thing.Thing;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.binding.BaseThingHandlerFactory;
import org.openhab.core.thing.binding.ThingHandler;
import org.openhab.core.thing.binding.ThingHandlerFactory;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The {@link TeufelPuckRpiGpioHandlerFactory} is responsible for creating things and thing
 * handlers.
 *
 * @author Joshua - Initial contribution
 */
@NonNullByDefault
@Component(configurationPid = "binding.teufelpuckrpigpio", service = ThingHandlerFactory.class)
public class TeufelPuckRpiGpioHandlerFactory extends BaseThingHandlerFactory {

    private final Logger logger = LoggerFactory.getLogger(TeufelPuckRpiGpioHandlerFactory.class);

    private static final Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = Set.of(THING_TYPE_TEUFEL_PUCK);

    @Override
    public boolean supportsThingType(ThingTypeUID thingTypeUID) {
        return SUPPORTED_THING_TYPES_UIDS.contains(thingTypeUID);
    }

    @Override
    protected @Nullable ThingHandler createHandler(Thing thing) {
        ThingTypeUID thingTypeUID = thing.getThingTypeUID();

        if (THING_TYPE_TEUFEL_PUCK.equals(thingTypeUID)) {
            logger.debug("createHandler for THING_TYPE_TEUFEL_PUCK");
            return new TeufelPuckRpiGpioHandler(thing);
        }

        return null;
    }
}
