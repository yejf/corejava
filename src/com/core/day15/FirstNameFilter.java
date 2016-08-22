/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day15;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author yejf
 *
 */
public class FirstNameFilter implements FilenameFilter {
	
	private String firstName;
	
	
	public FirstNameFilter(String firstName) {
		super();
		this.firstName = firstName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/* (non-Javadoc)
	 * @see java.io.FilenameFilter#accept(java.io.File, java.lang.String)
	 */
	@Override
	public boolean accept(File dir, String name) {
		System.out.println(">>>"+dir.getAbsolutePath());
		//�ж�name�Ƿ����ָ����ֵ
		if(name.contains(firstName)) {
			return true;
		} else {
			return false;
		}
	}

}
