/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day06;

/**
 * @author yejf
 *
 */
public class Bird extends Animals {

	//����
	private boolean wing; //�г���Ƿ��ܷ�

	/**
	 * @param name
	 * @param wing
	 */
	public Bird(String name, boolean wing) {
		super(name);
		this.wing = wing;
	}

	/**
	 * @return the wing
	 */
	public boolean isWing() {
		return wing;
	}

	/**
	 * @param wing the wing to set
	 */
	public void setWing(boolean wing) {
		this.wing = wing;
	}
	
	//ҵ�񷽷�
	public void fly(){
		if(wing){
			System.out.printf("[%s]���Է���.\n",getName());
		}else{
			System.out.printf("[%s]�ĳ���ܷ�...\n",getName());
		}
	}
}
