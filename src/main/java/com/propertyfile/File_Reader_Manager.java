package com.propertyfile;

public class File_Reader_Manager {
	private File_Reader_Manager() {
	}

	public static File_Reader_Manager getInstanceFRM() {
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;

	}

	public Config_Reader grtInstanceCR() throws Throwable {
		Config_Reader cr = new Config_Reader();
		return cr;

	}

}
