/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.util;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.core.day06.Account2;
import com.core.day09.Book;

/**
 * @author yejf
 *
 */
public class StringUtil {
	
	public static void main(String[] args) {
		//准备两个对象
		Book b = new Book("1005", 
				new String[]{"张三","李四"}, 28.5, "Thinking in Java");
		//
		System.out.println(toString(b));
		System.out.println("////////////////////////////");
		Account2 a = new Account2("1008", 1000.05);
		
		System.out.println(toString(a));
		
		
	}

	/*****
	 * 通用的toString方法，根据传入的对象，把此对象的所有属性
	 * 及属性值拼接成一个字符串并返回，属性名与属性值之间使用=拼接，
	 * 多个属性之间使用，号拼接。
	 * 此方法需要使用反射技术来实现
	 * @param obj
	 * @return
	 */
	public static String toString(Object obj) {
		//
		StringBuilder builder = new StringBuilder();
		//1. 通过对象获取 Class 实例
		Class<?> c = obj.getClass();
		//获取类名
		builder.append(c.getName()).append("[");
		//获取所有的属性名
		Field[] fields = c.getDeclaredFields();
		//遍历所有的属性
		//for(Field f : fields) {
		for(int i = 0;i < fields.length;i++) {
			Field f = fields[i];
			//首先，设置 属性是可以访问的
			f.setAccessible(true);
			//获取属性的修饰符
			int modifiers = f.getModifiers();
			//判断
			if(Modifier.isFinal(modifiers) ||
					Modifier.isStatic(modifiers)) {
				//这类属性不添加到 结果中
				continue; 
			} 
			//获取 每个属性的类型
			//Class<?> fClass = f.getDeclaringClass();
			
			//获取属性名
			builder.append(f.getName()).append("=");
			//获取属性值
			try {
				Object value = f.get(obj);
				if(value != null) {
					Class<?> valueClass = value.getClass();
					//进一步判断这个属性的值是否是数组？
					if(valueClass.isArray()) {
						builder.append("[");
						//对数组元素值做进一步的处理.
						//获取数组的长度
						int length = Array.getLength(value);
						//遍历
						for(int j=0;j<length;j++) {
							//通过Array来获取数组中的元素值
							Object arrObj = Array.get(value, j);
							//添加到builder中
							builder.append(arrObj);
							//判断要不要加,
							if(j != length - 1) {
								builder.append(",");
							}
						}
						builder.append("]");
						
//					} else if(valueClass.isPrimitive()){
					/*} else if(valueClass.equals(Double.class)){
												//Double.TYPE
						//直接添加它的值
						builder.append(value); 
						*/
					} else {
						//其它类型 [对象类型]
						//....
						builder.append(value);
					}
					
				} else {
					builder.append("null");
				}
				//添加,号
				if(i != fields.length - 1) {
					builder.append(",");
				}
			} catch (IllegalArgumentException 
						| IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		//
		builder.append("]");
		//返回
		return builder.toString();
	}
}

