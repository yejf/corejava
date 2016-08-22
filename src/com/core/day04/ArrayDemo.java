/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day04;

/**
 * @author yejf
 *
 */
public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建一个数组
		int[] arr = new int[10];
		//输出此数组中的所有元素
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.printf("%-2d",arr[i]);
		}
		System.out.println(); //换行
		
		//创建一个对象类型的数组
		String[] sarr = new String[5];
		//output
		for (int i = 0; i < sarr.length; i++) {
			sarr[i] = "jack";
			System.out.printf("%-5s",sarr[i]);
		}
		System.out.println(); //换行
		
		//再创建一个数组，直接赋值
		String[] names = new String[]{
			"马来来","李科","周磊","钱涛"
			,"段林峰","陈林","葛宏","李云雷"
		};
		//打印输出此数组的长度
		System.out.printf("names的长度：%d\n",names.length);
		
		//利用增强for循环来迭代
		for(String name : names){
			System.out.printf("%s\n",name);
		}
		
		//利用循环来给数组元素赋值。
		char[] letters = new char[26];
		/*for(char c='a';c<='z';c++){
			letters[c-97] = c;
		}*/
		for(int i=0;i<letters.length;i++){
			letters[i] = (char)('a'+i);
			//输出
			System.out.printf("%-2s",letters[i]);
		}
		System.out.println();
		
		//创建对象
		ArrayDemo ad = new ArrayDemo();
		char[] result = ad.getCaseLetters();
		//
		for(char c : result){
			System.out.printf("%-2s",c);
		}
		System.out.println();
	}
	
	//获取一个存放了26个大写字母的字符数组
	public char[] getCaseLetters(){
		char[] letters = new char[26];
		//给元素填充值
		for (int i = 0; i < letters.length; i++) {
			letters[i] = (char)('A'+i);
		}
		
		return letters;
	}

}






