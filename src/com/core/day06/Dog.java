/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day06;

/**
 * @author yejf
 *
 */
public class Dog extends Animals {

	//����
	private int teeth; //����

	/**
	 * @param name
	 * @param teeth
	 */
	public Dog(String name, int teeth) {
		super(name);
		this.teeth = teeth;
	}

	/**
	 * @return the teeth
	 */
	public int getTeeth() {
		return teeth;
	}

	/**
	 * @param teeth the teeth to set
	 */
	public void setTeeth(int teeth) {
		this.teeth = teeth;
	}
	
	//ҵ�񷽷�
	public void eatBone(){
		System.out.printf
			("[%s]ӵ��[%d]�����ݣ����ԳԹ�ͷ.\n",getName(),teeth);
	}
}
