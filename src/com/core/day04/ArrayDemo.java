/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
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
		//����һ������
		int[] arr = new int[10];
		//����������е�����Ԫ��
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.printf("%-2d",arr[i]);
		}
		System.out.println(); //����
		
		//����һ���������͵�����
		String[] sarr = new String[5];
		//output
		for (int i = 0; i < sarr.length; i++) {
			sarr[i] = "jack";
			System.out.printf("%-5s",sarr[i]);
		}
		System.out.println(); //����
		
		//�ٴ���һ�����飬ֱ�Ӹ�ֵ
		String[] names = new String[]{
			"������","���","����","Ǯ��"
			,"���ַ�","����","���","������"
		};
		//��ӡ���������ĳ���
		System.out.printf("names�ĳ��ȣ�%d\n",names.length);
		
		//������ǿforѭ��������
		for(String name : names){
			System.out.printf("%s\n",name);
		}
		
		//����ѭ����������Ԫ�ظ�ֵ��
		char[] letters = new char[26];
		/*for(char c='a';c<='z';c++){
			letters[c-97] = c;
		}*/
		for(int i=0;i<letters.length;i++){
			letters[i] = (char)('a'+i);
			//���
			System.out.printf("%-2s",letters[i]);
		}
		System.out.println();
		
		//��������
		ArrayDemo ad = new ArrayDemo();
		char[] result = ad.getCaseLetters();
		//
		for(char c : result){
			System.out.printf("%-2s",c);
		}
		System.out.println();
	}
	
	//��ȡһ�������26����д��ĸ���ַ�����
	public char[] getCaseLetters(){
		char[] letters = new char[26];
		//��Ԫ�����ֵ
		for (int i = 0; i < letters.length; i++) {
			letters[i] = (char)('A'+i);
		}
		
		return letters;
	}

}






