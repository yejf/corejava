/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day13;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yejf
 *
 */
public class TestSubList {

	public static void main(String[] args) {
		List<String> original = new ArrayList<>();
		//���һЩ���ݵ��˼�����
		original.add("jack");
		original.add("john");
		original.add("solo");
		original.add("rose");
		original.add("LiLei");
		original.add("HanMeiMei");
		
		//���
		for(String s : original){
			System.out.println(s);
		}
		System.out.println("���ƣ�"+original.size());
		//���� subList
		List<String> sub = original.subList(1, 4);
		//���sub������
		System.out.println(sub.getClass());
		//���sub������
		System.out.println("sub�е����ݣ�");
		for(String s : sub) {
			System.out.println(s);
		}
		System.out.println("sub �й��ƣ�"+sub.size());
		//���� sub ���´���һ�� ArrayList
		List<String> nsub = new ArrayList<>(sub);
		
		//
		sub.clear(); //���Ӱ�� original
		System.out.println("clear֮�� original�Ĵ�С:"+original.size());
		
		System.out.println("=== nsub�����ݣ�");
		//nsub����Ӱ����
		for(String s : nsub) {
			System.out.println(s);
		}
		
		//nsub��original ����ȫ���������ļ��ϡ�
		//�������нṹ�ԵĲ���������Ӱ�죬���ǣ�
		
		nsub.set(0, "hehe");
		//�鿴��original 
		System.out.println(">>> orignal ֵ��");
		for(String s : original) {
			System.out.println(s);
		}
		
		System.out.println(">>> nsub ֵ��");
		for(String s : nsub) {
			System.out.println(s);
		}
		
		//���Է��֣�originalû�б仯����ΪString�ǲ������
		//������������Ķ��񣬾ͻ������仯��
	}
}
