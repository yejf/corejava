/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.core.day09.Book;

/**
 * @author yejf
 *
 */
public class MapDemo {

	public static void main(String[] args) {
		// ����һ��Map
		Map<String, Book> map = new HashMap<>();
		// ģ�� 4����
		Book b1 = new Book("1001", new String[] { "Ī��" }, 25.6, "��");
		Book b2 = new Book("1002", new String[] { "��ӹ" }, 15.6, "Ц������");
		Book b3 = new Book("1003", new String[] { "����", "Y����" }, 45.6, "��Խ");
		Book b4 = new Book("1004", new String[] { "����", "������" }, 19.6, "Сʱ��");
		//��ͼ����ӵ� map��
		map.put(b1.getIsbn(), b1);
		map.put(b2.getIsbn(), b2);
		map.put(b3.getIsbn(), b3);
		map.put(b4.getIsbn(), b4);
		//
		System.out.printf("��ǰmap�Ĵ�С��%d\n",map.size());
		//�������map
		showMap_1(map);
		System.out.println("=====================");
		
		showMap_2(map);
	}
	
	//ʹ�� entrySet ������
	private static void showMap_2(Map<String, Book> map) {
		Set<Map.Entry<String, Book>> entrys = map.entrySet();
		//����
		for(Map.Entry<String, Book> entry : entrys) {
			//��ȡkey��value
			String key = entry.getKey();
			Book value = entry.getValue();
			//���
			System.out.printf("key:%s \n value: %s\n",key,value);
		}
		
	}
	//ʹ�� keySet ������
	private static void showMap_1(Map<String, Book> map) {
		Set<String> keys = map.keySet();
		//ʹ�õ�����
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			//��ȡkey
			String key = iter.next();
			//ͨ��key��ȡ value
			Book value = map.get(key);
			//���
			System.out.printf("key:%s \n value: %s\n",key,value);
		}
	}
}
