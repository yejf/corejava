/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day08;

/**
 * �򵥹�����
 * @author yejf
 *
 */
public class MoveFactory {

	//�ṩһ��������̬�������ؾ�����������֮һ
	public static Movable getInstance
				(int capacity, int speed, String owner) {
		
		//����Ĵ��벻��Ҫ��
		if(owner == null){
			return new Train(capacity, speed, "");
		}else{
			return new Plane(capacity, speed, "", owner);
		}
	}
	//...
}
