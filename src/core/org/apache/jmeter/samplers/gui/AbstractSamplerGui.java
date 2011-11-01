// $Header$
/*
 * Copyright 2000-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package org.apache.jmeter.samplers.gui;

import java.util.Arrays;
import java.util.Collection;

import javax.swing.JComponent;
import javax.swing.JPopupMenu;

import org.apache.jmeter.gui.AbstractJMeterGuiComponent;
import org.apache.jmeter.gui.util.MenuFactory;
import org.apache.jmeter.visualizers.Printable;

/**
 * This is the base class for JMeter GUI components which manage samplers.
 * 
 * @author Michael Stover
 * @version $Revision$
 */
public abstract class AbstractSamplerGui extends AbstractJMeterGuiComponent implements Printable {
	/**
	 * When a user right-clicks on the component in the test tree, or selects
	 * the edit menu when the component is selected, the component will be asked
	 * to return a JPopupMenu that provides all the options available to the
	 * user from this component.
	 * <p>
	 * This implementation returns menu items appropriate for most sampler
	 * components.
	 * 
	 * @return a JPopupMenu appropriate for the component.
	 */
	public JPopupMenu createPopupMenu() {
		return MenuFactory.getDefaultSamplerMenu();
	}

	/**
	 * This is the list of menu categories this gui component will be available
	 * under. This implementation returns
	 * {@link org.apache.jmeter.gui.util.MenuFactory#SAMPLERS}, which is
	 * appropriate for most sampler components.
	 * 
	 * @return a Collection of Strings, where each element is one of the
	 *         constants defined in MenuFactory
	 */
	public Collection getMenuCategories() {
		return Arrays.asList(new String[] { MenuFactory.SAMPLERS });
	}

	/**
	 * Subclasses need to over this method, if they wish to return something
	 * other than the Visualizer itself.
	 * 
	 * @return
	 */
	public JComponent getPrintableComponent() {
		return this;
	}
}