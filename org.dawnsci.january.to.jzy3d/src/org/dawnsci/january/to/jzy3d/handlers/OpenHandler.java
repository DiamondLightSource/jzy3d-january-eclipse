/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Lars Vogel <lars.Vogel@gmail.com> - Bug 419770
 *******************************************************************************/
package org.dawnsci.january.to.jzy3d.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
public class OpenHandler {

	@Execute
	public void execute(@UIEventTopic("Refresh-Part") String event, Shell shell){
		FileDialog dialog = new FileDialog(shell);
		dialog.open();
	}
}
