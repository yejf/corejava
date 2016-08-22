/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day08;

/**
 * @author yejf
 *
 */
public abstract class Vehicle implements Movable {

	private int capacity; //�ؿ���
	private int speed; //�ƶ��ٶ�
	private String name; //��ͨ��������
	
	public Vehicle() {
		super();
	}

	public Vehicle(int capacity, int speed, String name) {
		super();
		this.capacity = capacity;
		this.speed = speed;
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//�ṩһ������������ת�����ַ�����ҵ�񷽷����Ա����๲��
	protected String convert(int direction) {
		String str = "";
		switch (direction) {
		case EAST:
			str = "����";
			break;
		case WEST:
			str = "����";
			break;
		case NORTH:
			str = "����";
			break;
		case SOUTH:
			str = "�ϱ�";
			break;
		default:
			str = "δ֪����";
			break;
		}
		return str;
	}
}
