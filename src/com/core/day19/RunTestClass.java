package com.core.day19;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTestClass {

	public static void main(String[] args) {
		int pass = 0; //记录测试成功的个数
		int failure = 0; //记录测试失败的个数
		
		TestClass obj = new TestClass();
		//利用反射来读到 TestClass中的所有方法，并检查哪些打上了@Test注解
		Class<TestClass> c = TestClass.class;
		//获取所有方法
		Method[] methods = c.getDeclaredMethods();
		//遍历所有方法
		for(Method m : methods) {
			//判断此method是否打上了 @Ignore 注解
			if(m.isAnnotationPresent(Ignore.class)) {
				System.err.printf("方法%s被忽略了.\n",m.getName());
				continue;
			}
			//判断此method上是否打上了@Test注解
			if(m.isAnnotationPresent(Test.class)) {
				//则调用此方法
				try {
					m.invoke(obj);
					//成功调用
					pass++;
					
				} catch (IllegalAccessException 
							| IllegalArgumentException 
								| InvocationTargetException e) {
					//失败次数++
					failure++;
					System.err.printf("方法%s执行失败...\n",m.getName());
//					e.printStackTrace();
				}
			} else {
				//表示此方法没有打上 @Test 注解
				System.out.printf
					("\t方法%s()不会被反射执行\n",m.getName());
			}
		}
		//输出结果
		System.out.printf
			("\n扫描执行完成，成功:%d, 失败:%d \n",pass,failure);
	}
}

