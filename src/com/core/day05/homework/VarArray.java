/**
 * 本代码归我所有，唯吾独尊
 */
package com.core.day05.homework;

/**
 * @author 陈林
 *
 */
public class VarArray {
	
	private int valid; //有效元素个数
	private int capacity; //数组的容量
	
	private int[] datas; //存放数据
	
	
	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param arr
	 */
	/*public VarArray(int[] arr) {
		super();
		this.arr = arr;
	}*/
	
	public VarArray(){
		//指定默认的长度
		this.capacity = 16;
		//初始化数组
		this.datas = new int[this.capacity];
	}
	
	public VarArray(int length){
		this.capacity = length;
		//初始化数组
		this.datas = new int[this.capacity];
	}
	
	//添加元素
	public void add(int element){
		//一定要做容量的判断
		if(this.valid >= this.capacity){
			//当有效元素达到容量上限之时，就是容量扩展之时
			System.out.println("\t---开始扩容..");
			expand();
		}
		//把元素添加到数组中
		this.datas[this.valid] = element;
		//有效元素+1
		this.valid++;
	}
	
	//只负责扩容，只对内，不对外。
	private void expand() {
		//把容量扩容至原来的2倍
		this.capacity *= 2;
		//重新创建一个新的数组
		int[] newDatas = new int[this.capacity];
		//把原来的数据COPY到新数组中
		System.arraycopy(this.datas, 0, newDatas, 0, this.datas.length);
		//把新数组的地址赋给this.datas
		this.datas = newDatas;
	}

	//查找元素
	public int select(int element){
		int index=-1;
		for(int i=0;i<this.valid;i++){
			if(this.datas[i] == element){
				index=i;
				break;
			}
		}
		return index;
	}
	
	//删除元素
	public void remove(int element) {
		int index = select(element);
		if(index != -1){
			//表示有这个元素, 把此元素后面的元素依次往前移动一个位置
			for(int i=index;i<this.valid-1;i++){
				this.datas[i] = this.datas[i+1];
			}
			//有效元素-1 【重要】
			this.valid--;
			
		}else{
			System.out.println("无此元素!");
		}
	}
	
	//按下标查询元素
	public int get(int index){
		//判断
		if(index > this.valid || index < 0){
			System.out.println("没有此下标的元素.");
			return -1;
//			throw new IndexOutOfBoundsException("下标越界");
		}
		return this.datas[index];
	}
	
	//遍历所有元素
	public void showAllElement(){
		System.out.printf("当前元素：\n\t[");
		for(int i=0;i<this.valid;i++){
			System.out.printf("%s",this.datas[i]);
			if(i != this.valid-1){
				System.out.printf(", ");
			}
		}
		System.out.println("]");
	}
	
	//修改元素
	public void update(int index, int newElement){
		if(index > this.valid || index < 0){
			System.out.println("没有此下标的元素.");
			return ;
//			throw new IndexOutOfBoundsException("下标越界");
		}
		this.datas[index] = newElement;
	}
	
	//得到元素个数
	public int length(){
		//有效元素的个数
		return this.valid;
	}
}
