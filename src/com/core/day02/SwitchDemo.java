/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day02;

import java.util.Scanner;

/**
 * @author yejf
 *
 */
public class SwitchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�ӱ�����ʼ
		Scanner sc = new Scanner(System.in);
		//��ʾ�û����������
		System.out.println("��������ݺ��·�>");
		//��������������û�������
		int year = sc.nextInt();
		int month = sc.nextInt();
		//���� ��������������
		int days = -1;
		//
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			//��һ���ж� �Ƿ�������
			if((year%4==0 && year%100!=0) || year%400 == 0){
				days += 1;
			}
			break;
		default:
			System.out.println("������·ݲ��Ϸ�,�����˳�.");

		}
		//������
		if(days != -1){
			System.out.println(year+"��"+month+"����"+days+"��.");
		}
		//
		sc.close();
	}

}
