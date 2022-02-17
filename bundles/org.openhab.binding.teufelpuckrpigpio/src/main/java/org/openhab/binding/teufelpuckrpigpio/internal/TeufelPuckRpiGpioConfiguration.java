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

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The {@link TeufelPuckRpiGpioConfiguration} class contains fields mapping thing configuration parameters.
 *
 * @author Joshua - Initial contribution
 */
@NonNullByDefault
public class TeufelPuckRpiGpioConfiguration {

    public int gpioPinPower = 2;
    public int gpioPinAudioSource = 3;
    public int gpioPinVolumeUp = 4;
    public int gpioPinVolumeDown = 5;
}
