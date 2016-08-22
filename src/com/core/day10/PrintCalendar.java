/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day10;

import java.util.Calendar;
import java.util.Scanner;

import com.core.util.DateUtil;

/**
 * @author yejf
 *
 */
public class PrintCalendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���������>");
		int y = sc.nextInt();
		System.out.print("�������·�>");
		int m = sc.nextInt();
		if(m == 0) { //����·�����0����ʾ��ӡȫ�������
			PrintCalendar.print(y);
		}else{
			//���÷���
			PrintCalendar.print(y, m); //�˴���������ʡ�ԣ���Ϊ��ͬһ������
		}
		//
		sc.close();
	}
	
	/****
	 * ������������
	 * @param y
	 */
	public static void print(int y) {
		//1��12��ѭ����ӡ
		for(int i=1;i<=12;i++) {
			print(y,i);
		}
	}
	
	/****
	 * ���ָ����ݺ��·ݵ�����
	 * @param y ��
	 * @param m ��
	 */
	public static void print(int y, int m) {
		//
		if(DateUtil.checkYear(y)) {
			System.out.printf("��ݲ��Ϸ��� %d\n",y);
			return ;
		}
		//����·��Ƿ�Ϸ�
		if(DateUtil.checkMonth(m)) {
			System.out.printf("�·ݲ��Ϸ���%d\n",m);
			return ;
		}
		//�������
		Calendar cal = Calendar.getInstance();
		//�õ������Ǽ���, Ϊ��������ǰ�����һ�� *
		int day = cal.get(Calendar.DAY_OF_MONTH);
		//�Ѵ����������ꡢ����Ϊָ���������
		cal.set(Calendar.YEAR, y);
		cal.set(Calendar.MONTH, m-1);
		//���ն�����ǰ��1��
		cal.set(Calendar.DAY_OF_MONTH, 1);
		
		//�ٻ�ȡ���������������������ܼ�
		//���ֵ��1��7���ֱ��������������
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//�ٻ�ȡ������������������ �����·ݵ��������[28,29,30,31]
		int max = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		//����һ��������������������
		int count = 0;
		
		//����������
		System.out.printf("\t\t%d��%d��\n\n",y,m);
		
		//��ӡ�������ͷ��
		System.out.printf
		("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				"��","һ","��","��","��","��","��");
		
		//�����\t�������� week-1 �Ρ�
		for(int i=1;i<week;i++){
			System.out.print("\t");
			count++;
		}
		//��1��ʼѭ����ֱ�� max ����
		for(int i=1;i <= max; i++){
			//��� i, �� i == dayʱ����� *i
			System.out.printf("%s",(i == day) ? "*"+i : ""+i);
			//����
			count++;
			//�ж� �Ƿ���
			if(count == 7){
				System.out.println(); //����
				count = 0;
			} else {
				System.out.print("\t");
			}
		}
		//over
		System.out.println("\n________________________________________");
	}
}


