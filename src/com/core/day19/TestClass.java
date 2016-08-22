/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day19;

/**
 * @author yejf
 *
 */
public class TestClass {

	@Test
	public void m1() {
		
		System.out.println("m1 被执行了....");
	}

	@Test
	public void m2() {
		System.out.println("m2 被执行了....");
		throw new RuntimeException("m2 测试失败...");
	}

	@Test
	@Ignore
	public void m3() {
		System.out.println("m3 被执行了....");
	}

	public void m4() {
		System.out.println("m4 被执行了....");
	}

	@Test
	@Ignore
	public void m5() {
		System.out.println("m5 被执行了....");
		throw new RuntimeException("m5 测试失败...");
	}

	@Test
	public void m6() {
		System.out.println("m6 被执行了....");
		
	}
}
