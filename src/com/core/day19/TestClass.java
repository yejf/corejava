/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day19;

/**
 * @author yejf
 *
 */
public class TestClass {

	@Test
	public void m1() {
		
		System.out.println("m1 ��ִ����....");
	}

	@Test
	public void m2() {
		System.out.println("m2 ��ִ����....");
		throw new RuntimeException("m2 ����ʧ��...");
	}

	@Test
	@Ignore
	public void m3() {
		System.out.println("m3 ��ִ����....");
	}

	public void m4() {
		System.out.println("m4 ��ִ����....");
	}

	@Test
	@Ignore
	public void m5() {
		System.out.println("m5 ��ִ����....");
		throw new RuntimeException("m5 ����ʧ��...");
	}

	@Test
	public void m6() {
		System.out.println("m6 ��ִ����....");
		
	}
}
