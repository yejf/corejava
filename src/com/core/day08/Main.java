/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day08;

/**
 * @author yejf
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ģ��Ҫʹ�ý�ͨ����
		//���������
//		Movable m = new Plane(180, 540, "", "��������");
		
//		Movable m = MoveFactory.getInstance(180, 540, "��������");
		Movable m = MoveFactory.getInstance(1760, 220, null);
		//���÷���
		m.move(Movable.NORTH);
		//���Ҫ���ƶ���������һ���Ĵ������Ǹ���Σ�
		if(m instanceof CheckSpeed){
			if(m.getSpeed() >= 180) {
				System.out.printf("���棺�㳬����.\n");
			}
		}
		
		
	}

}

