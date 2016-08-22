/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day05;

/**
 * ѧԱ��
 * @author yejf
 *
 */
public class Student {

	//���ԣ�ӵ��ʲô
	private String stuNo; //ѧ��
	private String name;//����
	
	//�༶ ?
	
	private char gender; //�Ա�
	private int age; //����
	private String[] hobbies; //����
	
	//���췽��
	public Student(){
		System.out.println("-- �����˿ղι���...");
	}
	
	public Student(String name){
		System.out.println("-- ������1�ι��췽��...");
		this.name = name; //���ֲ�������ͬ������ʱ����this��ʾ����.
	}
	
	public void setName(String name){
		if(name.contains("ϰ���")){
			System.out.println("������Ч...");
		}else{
			this.name = name;
		}
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setAge(int age){
		//�Բ�������Ч�����ж�
		if(age <= 0){
			System.out.println("�������Ϸ�...");
			this.age = 18; // ͳһ��18��
			
		}else{
			this.age = age;
		}
	}
	
	/**
	 * @return the stuNo
	 */
	public String getStuNo() {
		return stuNo;
	}

	/**
	 * @param stuNo the stuNo to set
	 */
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * @return the hobbies
	 */
	public String[] getHobbies() {
		return hobbies;
	}

	/**
	 * @param hobbies the hobbies to set
	 */
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param stuNo
	 * @param name
	 * @param gender
	 * @param age
	 * @param hobbies
	 */
	public Student(String stuNo, String name, char gender, 
								int age, String[] hobbies) {
		this(name); //����1���� ����
		this.stuNo = stuNo;
//		this.name = name;
		this.gender = gender;
		this.age = age;
		this.hobbies = hobbies;
	}

	//����: �ܸ�ʲô
	//ѧϰ
	public void study(){
		//�ڷ����У����Է������е�����
		System.out.printf("[%s]����ѧϰ.\n",name);
	}
	
	//չʾ�Լ��İ��÷���
	public void showHobbies(){
		//��ӡ����Լ��İ���
		if(hobbies != null){
			System.out.printf("[%s]�İ���:\n",name);
			for(String h : hobbies){
				System.out.printf("\t%s\n",h);
			}
		}else{
			System.out.println("...�ް��ã�");
		}
	}
	
}
