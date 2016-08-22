package com.core.day14.homework;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author ����Ǭ
 * 2016��7��20�� ����8:42:27
 */
public class VarArray <T>{
	
	private List<T> datas; 
	
	public VarArray(){
		//ָ��Ĭ�ϵĳ���
		datas = new ArrayList<>();
	}
	
	
	//���Ԫ��
	public void add(T element){
		datas.add(element);
	}
	
	
	//����Ԫ��
	public int select(T element){
		int index=datas.indexOf(element);
		return index;
	}
	
	//ɾ��Ԫ��
	public void remove(T element) {
			datas.remove(element);
	}
	
	//���±��ѯԪ��
	public T get(int index){
		T m=datas.get(index);
		return m;
	}
	
	//��������Ԫ��
	public void showAllElement(){
		for(T a:datas){ 
			System.out.println(a);
		}
	}
	
	//�޸�Ԫ��
	public void update(int index, T newElement){
		datas.set(index, newElement);
		
	}
	
	//�õ����鳤��
	public int length(){
		return datas.size();
	}
}
