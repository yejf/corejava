/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day12;

import com.core.day12.Outer.Inner;

/**
 * @author yejf
 *
 */
public class TestOuter {

	public static void main(String[] args) {
		//�����ⲿ�����
		SpiderMan p = new SpiderMan("Peter", true);
		//
		p.run();
		
		//ͨ���ⲿ�����������ڲ������
//		Spider s = p.new SpiderDNA();
		/*Spider s = p.getDna();
		//
		s.run();*/
		
		//
		Outer o = new Outer();
		//������̬�ڲ������
		Inner i = new Inner();
		i.print();
		System.out.println("======================");
		o.localMethod();
	}
}
