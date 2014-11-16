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
package at.bitfire.davdroid.mirakel;

import net.fortuna.ical4j.model.property.ProdId;

public class Constants {
	public static final String
		APP_VERSION = "0.6.7-mirakel",
		ACCOUNT_TYPE = "bitfire.at.davdroid.mirakel",
		WEB_URL_HELP = "http://davdroid.bitfire.at/configuration?pk_campaign=davdroid-app",
		
		SETTING_DISABLE_COMPRESSION = "disable_compression",
		SETTING_NETWORK_LOGGING = "network_logging";
    public static final ProdId PRODUCT_ID = new ProdId("-//bitfire web engineering//DAVdroid " + Constants.APP_VERSION + " (ical4j 2.0.x)//EN");
}
