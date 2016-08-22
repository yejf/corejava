/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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
		//׼����������
		Book b = new Book("1005", 
				new String[]{"����","����"}, 28.5, "Thinking in Java");
		//
		System.out.println(toString(b));
		System.out.println("////////////////////////////");
		Account2 a = new Account2("1008", 1000.05);
		
		System.out.println(toString(a));
		
		
	}

	/*****
	 * ͨ�õ�toString���������ݴ���Ķ��󣬰Ѵ˶������������
	 * ������ֵƴ�ӳ�һ���ַ��������أ�������������ֵ֮��ʹ��=ƴ�ӣ�
	 * �������֮��ʹ�ã���ƴ�ӡ�
	 * �˷�����Ҫʹ�÷��似����ʵ��
	 * @param obj
	 * @return
	 */
	public static String toString(Object obj) {
		//
		StringBuilder builder = new StringBuilder();
		//1. ͨ�������ȡ Class ʵ��
		Class<?> c = obj.getClass();
		//��ȡ����
		builder.append(c.getName()).append("[");
		//��ȡ���е�������
		Field[] fields = c.getDeclaredFields();
		//�������е�����
		//for(Field f : fields) {
		for(int i = 0;i < fields.length;i++) {
			Field f = fields[i];
			//���ȣ����� �����ǿ��Է��ʵ�
			f.setAccessible(true);
			//��ȡ���Ե����η�
			int modifiers = f.getModifiers();
			//�ж�
			if(Modifier.isFinal(modifiers) ||
					Modifier.isStatic(modifiers)) {
				//�������Բ���ӵ� �����
				continue; 
			} 
			//��ȡ ÿ�����Ե�����
			//Class<?> fClass = f.getDeclaringClass();
			
			//��ȡ������
			builder.append(f.getName()).append("=");
			//��ȡ����ֵ
			try {
				Object value = f.get(obj);
				if(value != null) {
					Class<?> valueClass = value.getClass();
					//��һ���ж�������Ե�ֵ�Ƿ������飿
					if(valueClass.isArray()) {
						builder.append("[");
						//������Ԫ��ֵ����һ���Ĵ���.
						//��ȡ����ĳ���
						int length = Array.getLength(value);
						//����
						for(int j=0;j<length;j++) {
							//ͨ��Array����ȡ�����е�Ԫ��ֵ
							Object arrObj = Array.get(value, j);
							//��ӵ�builder��
							builder.append(arrObj);
							//�ж�Ҫ��Ҫ��,
							if(j != length - 1) {
								builder.append(",");
							}
						}
						builder.append("]");
						
//					} else if(valueClass.isPrimitive()){
					/*} else if(valueClass.equals(Double.class)){
												//Double.TYPE
						//ֱ���������ֵ
						builder.append(value); 
						*/
					} else {
						//�������� [��������]
						//....
						builder.append(value);
					}
					
				} else {
					builder.append("null");
				}
				//���,��
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
		//����
		return builder.toString();
	}
}

