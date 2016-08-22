/**
 * ������������У�Ψ�����
 */
package com.core.day05.homework;

/**
 * @author ����
 *
 */
public class VarArray {
	
	private int valid; //��ЧԪ�ظ���
	private int capacity; //���������
	
	private int[] datas; //�������
	
	
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
		//ָ��Ĭ�ϵĳ���
		this.capacity = 16;
		//��ʼ������
		this.datas = new int[this.capacity];
	}
	
	public VarArray(int length){
		this.capacity = length;
		//��ʼ������
		this.datas = new int[this.capacity];
	}
	
	//���Ԫ��
	public void add(int element){
		//һ��Ҫ���������ж�
		if(this.valid >= this.capacity){
			//����ЧԪ�شﵽ��������֮ʱ������������չ֮ʱ
			System.out.println("\t---��ʼ����..");
			expand();
		}
		//��Ԫ����ӵ�������
		this.datas[this.valid] = element;
		//��ЧԪ��+1
		this.valid++;
	}
	
	//ֻ�������ݣ�ֻ���ڣ������⡣
	private void expand() {
		//������������ԭ����2��
		this.capacity *= 2;
		//���´���һ���µ�����
		int[] newDatas = new int[this.capacity];
		//��ԭ��������COPY����������
		System.arraycopy(this.datas, 0, newDatas, 0, this.datas.length);
		//��������ĵ�ַ����this.datas
		this.datas = newDatas;
	}

	//����Ԫ��
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
	
	//ɾ��Ԫ��
	public void remove(int element) {
		int index = select(element);
		if(index != -1){
			//��ʾ�����Ԫ��, �Ѵ�Ԫ�غ����Ԫ��������ǰ�ƶ�һ��λ��
			for(int i=index;i<this.valid-1;i++){
				this.datas[i] = this.datas[i+1];
			}
			//��ЧԪ��-1 ����Ҫ��
			this.valid--;
			
		}else{
			System.out.println("�޴�Ԫ��!");
		}
	}
	
	//���±��ѯԪ��
	public int get(int index){
		//�ж�
		if(index > this.valid || index < 0){
			System.out.println("û�д��±��Ԫ��.");
			return -1;
//			throw new IndexOutOfBoundsException("�±�Խ��");
		}
		return this.datas[index];
	}
	
	//��������Ԫ��
	public void showAllElement(){
		System.out.printf("��ǰԪ�أ�\n\t[");
		for(int i=0;i<this.valid;i++){
			System.out.printf("%s",this.datas[i]);
			if(i != this.valid-1){
				System.out.printf(", ");
			}
		}
		System.out.println("]");
	}
	
	//�޸�Ԫ��
	public void update(int index, int newElement){
		if(index > this.valid || index < 0){
			System.out.println("û�д��±��Ԫ��.");
			return ;
//			throw new IndexOutOfBoundsException("�±�Խ��");
		}
		this.datas[index] = newElement;
	}
	
	//�õ�Ԫ�ظ���
	public int length(){
		//��ЧԪ�صĸ���
		return this.valid;
	}
}
