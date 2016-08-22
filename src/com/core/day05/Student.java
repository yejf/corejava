/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day05;

/**
 * 学员类
 * @author yejf
 *
 */
public class Student {

	//属性：拥有什么
	private String stuNo; //学号
	private String name;//姓名
	
	//班级 ?
	
	private char gender; //性别
	private int age; //年龄
	private String[] hobbies; //爱好
	
	//构造方法
	public Student(){
		System.out.println("-- 调用了空参构造...");
	}
	
	public Student(String name){
		System.out.println("-- 调用了1参构造方法...");
		this.name = name; //当局部变量名同属性名时，加this以示区别.
	}
	
	public void setName(String name){
		if(name.contains("习大大")){
			System.out.println("参数无效...");
		}else{
			this.name = name;
		}
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setAge(int age){
		//对参数的有效性做判断
		if(age <= 0){
			System.out.println("参数不合法...");
			this.age = 18; // 统一给18岁
			
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
		this(name); //调用1构造 方法
		this.stuNo = stuNo;
//		this.name = name;
		this.gender = gender;
		this.age = age;
		this.hobbies = hobbies;
	}

	//方法: 能干什么
	//学习
	public void study(){
		//在方法中，可以访问所有的属性
		System.out.printf("[%s]正在学习.\n",name);
	}
	
	//展示自己的爱好方法
	public void showHobbies(){
		//打印输出自己的爱好
		if(hobbies != null){
			System.out.printf("[%s]的爱好:\n",name);
			for(String h : hobbies){
				System.out.printf("\t%s\n",h);
			}
		}else{
			System.out.println("...无爱好！");
		}
	}
	
}
