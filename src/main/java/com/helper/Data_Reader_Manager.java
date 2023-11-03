package com.helper;

import java.io.IOException;

public class Data_Reader_Manager {

	/*
	 * Doubleton Design Pattern
	 * 
	 * 1. private Constructor
	 * 
	 * 2. One static Method --> Create Object for Data_Reader_Manager
	 * 
	 * 3. One Normal Method --> Create Object for Data_Reader
	 * 
	 * 
	 */

	static Data_Reader_Manager drm;

	Data_Reader dr;

	private Data_Reader_Manager() {

	}

	public static Data_Reader_Manager getInstanceDRM() {

		if (drm == null) {

			drm = new Data_Reader_Manager();

		}

		return drm;

	}

	public Data_Reader getInstanceDR() throws IOException {

		if (dr == null) {

			dr = new Data_Reader();

		}

		return dr;

	}

}
