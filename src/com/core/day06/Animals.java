/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day06;

/**
 * @author yejf
 *
 */
public class Animals {

	//����
	private String name; //����

	/**
	 * 
	 */
	public Animals() {
		super();
	}

	/**
	 * @param name
	 */
	public Animals(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	//ҵ�񷽷�
	public void shout(){
		System.out.printf("[%s]���ڷ�������...\n",name);
	}
}
