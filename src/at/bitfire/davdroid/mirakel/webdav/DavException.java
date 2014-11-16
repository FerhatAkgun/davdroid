/*******************************************************************************
 * Copyright (c) 2014 Ricki Hirner (bitfire web engineering).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Richard Hirner (bitfire web engineering) - initial API and implementation
 ******************************************************************************/
package at.bitfire.davdroid.mirakel.webdav;

public class DavException extends Exception {
	private static final long serialVersionUID = -2118919144443165706L;
	
	final private static String prefix = "Invalid DAV response: ";
	
	/* used to indiciate DAV protocol errors */
	
	
	public DavException(String message) {
		super(prefix + message);
	}
	
	public DavException(String message, Throwable ex) {
		super(prefix + message, ex);
	}
}