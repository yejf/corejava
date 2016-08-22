package com.core.day14.homework;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author 何子乾
 * 2016年7月20日 下午8:42:27
 */
public class VarArray <T>{
	
	private List<T> datas; 
	
	public VarArray(){
		//指定默认的长度
		datas = new ArrayList<>();
	}
	
	
	//添加元素
	public void add(T element){
		datas.add(element);
	}
	
	
	//查找元素
	public int select(T element){
		int index=datas.indexOf(element);
		return index;
	}
	
	//删除元素
	public void remove(T element) {
			datas.remove(element);
	}
	
	//按下标查询元素
	public T get(int index){
		T m=datas.get(index);
		return m;
	}
	
	//遍历所有元素
	public void showAllElement(){
		for(T a:datas){ 
			System.out.println(a);
		}
	}
	
	//修改元素
	public void update(int index, T newElement){
		datas.set(index, newElement);
		
	}
	
	//得到数组长度
	public int length(){
		return datas.size();
	}
}
