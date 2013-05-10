/* Copyright (C) 2013  Zachary Scott <zscott.dev@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.zeddev.zedlog.logger.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.zeddev.zedlog.logger.DataLogger;

/**
 * A simple factory which produces concrete <code>DataLogger</code>s.
 *
 * @author Zachary Scott <zscott.dev@gmail.com>
 */
public class DataLoggers {

	// the cached logger instances
	private static final Map<String, DataLogger> LOGGERS = new HashMap<>();
		// NOTE They can be cached because cannot be modified during execution.

	// the available logger types
	private static final List<String> TYPES = new ArrayList<>();

	static {

		// the list of available logger instances
		final DataLogger[] instances = {
			new CharTypedLogger(),
			new KeyPressedLogger(),
			new KeyReleasedLogger(),
			new MouseClickLogger(),
			new MousePressedLogger(),
			new MouseReleasedLogger(),
			new MouseMovementLogger(),
			new MouseDraggedLogger(),
			new MouseWheelLogger()
		};

		// set all available loggers
		for (DataLogger loggerInstance : instances) {
			LOGGERS.put(loggerInstance.type(), loggerInstance);
			TYPES.add(loggerInstance.type());
		}

	}

	private DataLoggers() {
	}

	/**
	 * Produces new <code>DataLogger<code> instances based on the given type.
	 * See <code>typeList()</code> for full list.
	 *
	 * @param type The type of the new <code>DataLogger</code>.
	 * @return The new <code>DataLogger</code> instance.
	 */
	public static DataLogger newDataLogger(String type) {

		assert(type != null);

		if (LOGGERS.containsKey(type)) {
			return LOGGERS.get(type);
		} else {
			return null;
		}

	}

	/**
	 * Returns all available <code>DataLogger</code> types that can be used with
	 * <code>newDataLogger()</code>.
	 * The currently supported types are;
	 * <ul>
	 *	<li>"CharTyped" - <code>CharTypedLogger</code>.</li>
	 *	<li>"keyPressed" - <code>KeyPressedLogger</code>.</li>
	 *  <li>"KeyReleased" - <code>CharTypedLogger</code>.</li>
	 *  <li>"MouseClick" - <code>MouseClickLogger</code>.</li>
	 *	<li>"MousePressed" - <code>MousePressedLogger</code>.</li>
	 *	<li>"MouseReleased" - <code>MouseReleasedLogger</code>.</li>
	 *  <li>"MouseMovement" - <code>MouseMovementLogger</code>.</li>
	 *  <li>"MouseDrag" - <code>MouseDraggedLogger</code>.</li>
	 *  <li>"MouseWheel" - <code>MouseWheelLogger</code>.</li>
	 * </ul>
	 *
	 * @return The list of available <code>DataLogger</code> types.
	 */
	public static List<String> typeList() {
		return new ArrayList<>(TYPES);
	}

}
