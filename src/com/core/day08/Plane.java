/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day08;

/**
 * @author yejf
 *
 */
public class Plane extends Vehicle {
	
	private String owner; //�������չ�˾ 
	
	/**
	 * @param capacity
	 * @param speed
	 * @param name
	 * @param owner
	 */
	public Plane(int capacity, int speed, String name, String owner) {
		super(capacity, speed, name);
		this.owner = owner;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}


	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}


	/* (non-Javadoc)
	 * @see com.core.day08.Movable#move(int)
	 */
	@Override
	public void move(int direction) {
		System.out.printf
			("һ��[%s]�ķɻ�����[%d]����������[%d]���ٶ���[%s]��ȥ.\n"
					,owner,getCapacity(),getSpeed(),convert(direction));
	}

}
