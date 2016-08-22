package com.core.day15.homework;

import java.io.File;
import java.io.FilenameFilter;

public class FirstNameFilter2 implements FilenameFilter {

	private String firstname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public FirstNameFilter2(String firstname) {
		super();
		this.firstname = firstname;
	}

	@Override
	public boolean accept(File dir, String name) {
		// 判断name是否包含指定的值
		File f = new File(dir.getAbsolutePath() + File.separator + name);
		
//		File f = new File(dir, name);
//		if (name.contains(firstname) && !f.isDirectory()) {
		if (name.endsWith(firstname) && !f.isDirectory()) {
			return true;
		} else {
			return false;
		}
	}

}
